package xyz.redtorch.gateway;

import xyz.redtorch.pb.CoreField.*;

public interface GatewayApi {

    /**
     * 获取ID
     *
     * @return
     */
    String getGatewayId();

    /**
     * 获取名称
     *
     * @return
     */
    String getGatewayName();

    /**
     * 获取网关
     *
     * @return
     */
    GatewayField getGateway();

    /**
     * 获取日志字符串
     *
     * @return
     */
    String getLogInfo();

    /**
     * 订阅
     *
     * @param contract
     */
    boolean subscribe(ContractField contract);

    /**
     * 退订
     *
     * @param contract
     */
    boolean unsubscribe(ContractField contract);

    /**
     * 提交定单
     *
     * @param submitOrderReq
     * @return
     */
    String submitOrder(SubmitOrderReqField submitOrderReq);

    /**
     * 撤销定单
     *
     * @param cancelOrderReq
     * @return
     */
    boolean cancelOrder(CancelOrderReqField cancelOrderReq);

    /**
     * 搜寻合约
     *
     * @param contract
     */
    void searchContract(ContractField contract);

    /**
     * 广播Position
     *
     * @param position
     */
    void emitPosition(PositionField position);

    /**
     * 广播Account
     *
     * @param account
     */
    void emitAccount(AccountField account);

    /**
     * 广播Contract
     *
     * @param contract
     */
    void emitContract(ContractField contract);

    /**
     * 广播Tick
     *
     * @param tick
     */
    void emitTick(TickField tick);

    /**
     * 广播Trade
     *
     * @param trade
     */
    void emitTrade(TradeField trade);

    /**
     * 广播Order
     *
     * @param order
     */
    void emitOrder(OrderField order);

    /**
     * 广播公告
     *
     * @param notice
     */
    void emitNotice(NoticeField notice);

    /**
     * 获取网关配置
     *
     * @return
     */
    GatewaySettingField getGatewaySetting();

    /**
     * 连接
     */
    void connect();

    /**
     * 断开
     */
    void disconnect();

    /**
     * 网关连接状态
     *
     * @return
     */
    boolean isConnected();

    /**
     * 获取登录错误标记
     *
     * @return
     */
    boolean getAuthErrorFlag();

    /**
     * 设置登录错误标记
     *
     * @return
     */
    void setAuthErrorFlag(boolean loginErrorFlag);

    /**
     * 获取最后一次开始登陆的时间戳
     *
     * @return
     */
    long getLastConnectBeginTimestamp();

    /**
     * 更新近似时间戳
     */
    void updateApproximateTimestamp();

    /**
     * 获取近似时间戳
     *
     * @return
     */
    long getApproximatelyTimestamp();

}
