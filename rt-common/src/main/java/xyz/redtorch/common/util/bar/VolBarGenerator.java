package xyz.redtorch.common.util.bar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.redtorch.common.util.CommonUtils;
import xyz.redtorch.pb.CoreField.BarField;
import xyz.redtorch.pb.CoreField.TickField;

import java.time.LocalDateTime;

public class VolBarGenerator {
    private static final Logger logger = LoggerFactory.getLogger(VolBarGenerator.class);

    private BarField.Builder barBuilder = null;

    private TickField preTick = null;
    private LocalDateTime lastTickLocalDateTime = null;

    private boolean newFlag = false;

    private String barUniformSymbol = null;

    private final long barVolumeDelta;

    CommonBarCallBack commonBarCallBack;

    public VolBarGenerator(long barVolumeDelta, CommonBarCallBack commonBarCallBack) {

        if (barVolumeDelta < 20 || barVolumeDelta > 2000000) {
            throw new RuntimeException("参数取值范围[20,2000000]");
        }

        this.barVolumeDelta = barVolumeDelta;
        this.commonBarCallBack = commonBarCallBack;
    }

    public void updateTick(TickField tick) {

        // 如果tick为空或者合约不匹配则返回
        if (tick == null) {
            logger.warn("输入的Tick数据为空,当前Bar合约{}", barUniformSymbol);
            return;
        }

        if (barUniformSymbol == null) {
            barUniformSymbol = tick.getUniformSymbol();
        } else if (!barUniformSymbol.equals(tick.getUniformSymbol())) {
            logger.warn("合约不匹配,当前Bar合约{}", barUniformSymbol);
            return;
        }

        LocalDateTime tickLocalDateTime = CommonUtils.millsToLocalDateTime(tick.getActionTimestamp());

        // 此处过滤用于一个策略在多个网关订阅了同一个合约的情况下,Tick到达顺序和实际产生顺序不一致或者重复的情况
        if (lastTickLocalDateTime != null && tickLocalDateTime.isBefore(lastTickLocalDateTime)) {
            logger.warn("时间乱序,当前Bar合约{}", barUniformSymbol);
            return;
        }

        lastTickLocalDateTime = tickLocalDateTime;

        if (preTick != null) {
            // 如果切换交易日
            if (preTick.getTradingDay() != tick.getTradingDay()) {
                preTick = null;
                if (barBuilder != null) {
                    finish();
                }
            }
        }

        if (barBuilder == null) {
            barBuilder = BarField.newBuilder();
            newFlag = true;
        } else {
            newFlag = false;
        }

        if (newFlag) {
            barBuilder.setUniformSymbol(tick.getUniformSymbol());
            barBuilder.setGatewayId(tick.getGatewayId());
            barBuilder.setTradingDay(tick.getTradingDay());
            barBuilder.setActionDay(tick.getActionDay());

            barBuilder.setOpenPrice(tick.getLastPrice());
            barBuilder.setHighPrice(tick.getLastPrice());
            barBuilder.setLowPrice(tick.getLastPrice());

            barBuilder.setPreSettlePrice(tick.getPreSettlePrice());
            barBuilder.setPreClosePrice(tick.getPreClosePrice());
            barBuilder.setPreOpenInterest(tick.getPreOpenInterest());

            barBuilder.setActionTimestamp(tick.getActionTimestamp());
            barBuilder.setActionTime(tick.getActionTime());

        } else {
            // 当日最高价发生变动
            if (preTick != null && !CommonUtils.isEquals(tick.getHighPrice(), preTick.getHighPrice())) {
                barBuilder.setHighPrice(tick.getHighPrice());
            } else {
                barBuilder.setHighPrice(Math.max(barBuilder.getHighPrice(), tick.getLastPrice()));
            }

            // 当日最低价发生变动
            if (preTick != null && !CommonUtils.isEquals(tick.getLowPrice(), preTick.getLowPrice())) {
                barBuilder.setLowPrice(tick.getLowPrice());
            } else {
                barBuilder.setLowPrice(Math.min(barBuilder.getLowPrice(), tick.getLastPrice()));
            }

        }

        barBuilder.setClosePrice(tick.getLastPrice());
        barBuilder.setOpenInterest(tick.getOpenInterest());
        barBuilder.setVolume(tick.getVolume());
        barBuilder.setTurnover(tick.getTurnover());
        barBuilder.setTurnoverDelta(barBuilder.getTurnoverDelta() + tick.getTurnoverDelta());
        barBuilder.setOpenInterestDelta(barBuilder.getOpenInterestDelta() + tick.getOpenInterestDelta());

        long tickVolumeDelta = tick.getVolumeDelta();
        long volumeDeltaSum = tickVolumeDelta + barBuilder.getVolumeDelta();

        // 需要切分
        if (volumeDeltaSum >= barVolumeDelta) {
            int counter = 0;
            while (volumeDeltaSum >= barVolumeDelta) {
                barBuilder.setVolumeDelta(barVolumeDelta);
                if (counter == 0) {
                    commonBarCallBack.call(barBuilder);
                } else {
                    barBuilder.setOpenPrice(tick.getLastPrice());
                    barBuilder.setHighPrice(tick.getLastPrice());
                    barBuilder.setLowPrice(tick.getLastPrice());

                    barBuilder.setActionTimestamp(tick.getActionTimestamp());
                    barBuilder.setActionTime(tick.getActionTime());

                    barBuilder.setTurnoverDelta(0);
                    barBuilder.setOpenInterestDelta(0);

                    commonBarCallBack.call(barBuilder);
                }
                volumeDeltaSum -= barVolumeDelta;
                counter++;
            }

            if (volumeDeltaSum == 0) {
                barBuilder = null;
                newFlag = true;
            } else {
                barBuilder.setOpenPrice(tick.getLastPrice());
                barBuilder.setHighPrice(tick.getLastPrice());
                barBuilder.setLowPrice(tick.getLastPrice());

                barBuilder.setActionTimestamp(tick.getActionTimestamp());
                barBuilder.setActionTime(tick.getActionTime());

                barBuilder.setTurnoverDelta(0);
                barBuilder.setOpenInterestDelta(0);

                barBuilder.setVolumeDelta(volumeDeltaSum);
            }
        } else {
            barBuilder.setVolumeDelta(volumeDeltaSum);
        }


        preTick = tick;
    }

    public void finish() {
        if (barBuilder != null) {
            // 回调OnBar方法
            commonBarCallBack.call(barBuilder);
        }

        barBuilder = null;
        newFlag = true;
    }
}
