package xyz.redtorch.node.master.rpc.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.redtorch.common.service.HistoryMarketDataService;
import xyz.redtorch.common.service.MarketDataService;
import xyz.redtorch.common.service.TodayMarketDataService;
import xyz.redtorch.common.util.bar.BarUtils;
import xyz.redtorch.common.util.rpc.RpcUtils;
import xyz.redtorch.node.master.rpc.service.RpcServerOverHttpReqHandlerService;
import xyz.redtorch.node.master.service.MarketDataRecordingService;
import xyz.redtorch.node.master.service.MasterSystemService;
import xyz.redtorch.node.master.service.MasterTradeCachesService;
import xyz.redtorch.node.master.service.MasterTradeExecuteService;
import xyz.redtorch.node.master.web.socket.WebSocketServerHandler;
import xyz.redtorch.pb.CoreEnum.BarPeriodEnum;
import xyz.redtorch.pb.CoreEnum.MarketDataDBTypeEnum;
import xyz.redtorch.pb.CoreField.*;
import xyz.redtorch.pb.CoreRpc.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class RpcServerOverHttpReqHandlerServiceImpl implements RpcServerOverHttpReqHandlerService {

    private static final Logger logger = LoggerFactory.getLogger(RpcServerOverHttpReqHandlerServiceImpl.class);

    @Autowired
    private MasterTradeCachesService masterTradeCachesService;
    @Autowired
    private MasterTradeExecuteService masterTradeExecuteService;
    @Autowired
    private MasterSystemService masterSystemService;
    @Autowired
    private MarketDataService marketDataService;
    @Autowired
    private HistoryMarketDataService historyMarketDataService;
    @Autowired
    private TodayMarketDataService todayMarketDataService;
    @Autowired
    private MarketDataRecordingService marketDataRecordingService;
    @Autowired
    private WebSocketServerHandler webSocketServerHandler;

    @Override
    public byte[] getOrderList(CommonReqField commonReq) {
        String transactionId = commonReq.getTransactionId();

        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        List<OrderField> orderList = masterTradeCachesService.getOrderList(commonReq.getOperatorId());

        if (orderList == null) {
            orderList = new ArrayList<>();
        }

        RpcGetOrderListRsp.Builder rpcGetOrderListRspBuilder = RpcGetOrderListRsp.newBuilder() //
                .setCommonRsp(commonRspBuilder) //
                .addAllOrder(orderList);

        return RpcUtils.generateRpcDep(RpcId.GET_ORDER_LIST_RSP, transactionId, rpcGetOrderListRspBuilder.build().toByteString());
    }

    @Override
    public byte[] getWorkingOrderList(CommonReqField commonReq) {
        String transactionId = commonReq.getTransactionId();

        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        List<OrderField> workingOrderList = masterTradeCachesService.getWorkingOrderList(commonReq.getOperatorId());

        if (workingOrderList == null) {
            workingOrderList = new ArrayList<>();
        }

        RpcGetWorkingOrderListRsp.Builder rpcGetWorkingOrderListRspBuilder = RpcGetWorkingOrderListRsp.newBuilder() //
                .setCommonRsp(commonRspBuilder) //
                .addAllOrder(workingOrderList);


        return RpcUtils.generateRpcDep(RpcId.GET_WORKING_ORDER_LIST_RSP, transactionId, rpcGetWorkingOrderListRspBuilder.build().toByteString());
    }

    @Override
    public byte[] queryOrderByOrderId(CommonReqField commonReq, String orderId) {
        String transactionId = commonReq.getTransactionId();

        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        OrderField order = null;

        if (StringUtils.isBlank(orderId)) {
            logger.error("参数orderId缺失");
            commonRspBuilder.setErrorId(1).setErrorMsg("参数orderId缺失");
        } else {
            order = masterTradeCachesService.queryOrderByOrderId(commonReq.getOperatorId(), orderId);
        }

        RpcQueryOrderByOrderIdRsp.Builder rpcQueryOrderByOrderIdRspBuilder = RpcQueryOrderByOrderIdRsp.newBuilder();
        if (order == null) {
            rpcQueryOrderByOrderIdRspBuilder.setCommonRsp(commonRspBuilder);
        } else {
            rpcQueryOrderByOrderIdRspBuilder.setCommonRsp(commonRspBuilder).setOrder(order);
        }

        return RpcUtils.generateRpcDep(RpcId.QUERY_ORDER_BY_ORDER_ID_RSP, transactionId, rpcQueryOrderByOrderIdRspBuilder.build().toByteString());
    }

    @Override
    public byte[] queryOrderByOriginOrderId(CommonReqField commonReq, String originOrderId) {
        String transactionId = commonReq.getTransactionId();

        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        OrderField order = null;

        if (StringUtils.isBlank(originOrderId)) {
            logger.error("参数originOrderId缺失");
            commonRspBuilder.setErrorId(1).setErrorMsg("参数originOrderId缺失");
        } else {
            order = masterTradeCachesService.queryOrderByOriginOrderId(commonReq.getOperatorId(), originOrderId);
        }

        RpcQueryOrderByOriginOrderIdRsp.Builder rpcQueryOrderByOriginOrderIdRspBuilder = RpcQueryOrderByOriginOrderIdRsp.newBuilder();
        if (order == null) {
            rpcQueryOrderByOriginOrderIdRspBuilder.setCommonRsp(commonRspBuilder);
        } else {
            rpcQueryOrderByOriginOrderIdRspBuilder.setCommonRsp(commonRspBuilder).setOrder(order);
        }

        return RpcUtils.generateRpcDep(RpcId.QUERY_ORDER_BY_ORIGIN_ORDER_ID_RSP, transactionId, rpcQueryOrderByOriginOrderIdRspBuilder.build().toByteString());
    }

    @Override
    public byte[] queryOrderListByAccountId(CommonReqField commonReq, String accountId) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        List<OrderField> orderList = null;

        if (StringUtils.isBlank(accountId)) {
            logger.error("参数accountId缺失");
            commonRspBuilder.setErrorId(1).setErrorMsg("参数accountId缺失");
        } else {
            orderList = masterTradeCachesService.queryOrderListByAccountId(commonReq.getOperatorId(), accountId);
        }

        if (orderList == null) {
            orderList = new ArrayList<>();
        }

        RpcQueryOrderListByAccountIdRsp.Builder rpcQueryOrderListByAccountIdRspBuilder = RpcQueryOrderListByAccountIdRsp.newBuilder() //
                .setCommonRsp(commonRspBuilder) //
                .addAllOrder(orderList);

        return RpcUtils.generateRpcDep(RpcId.QUERY_ORDER_LIST_BY_ACCOUNT_ID_RSP, transactionId, rpcQueryOrderListByAccountIdRspBuilder.build().toByteString());
    }

    @Override
    public byte[] queryOrderListByUniformSymbol(CommonReqField commonReq, String uniformSymbol) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        List<OrderField> orderList = null;

        if (StringUtils.isBlank(uniformSymbol)) {
            logger.error("参数uniformSymbol缺失");
            commonRspBuilder.setErrorId(1).setErrorMsg("参数uniformSymbol缺失");
        } else {
            orderList = masterTradeCachesService.queryOrderListByUniformSymbol(commonReq.getOperatorId(), uniformSymbol);
        }
        if (orderList == null) {
            orderList = new ArrayList<>();
        }

        RpcQueryOrderListByUniformSymbolRsp.Builder rpcQueryOrderListByUniformSymbolRspBuilder = RpcQueryOrderListByUniformSymbolRsp.newBuilder() //
                .setCommonRsp(commonRspBuilder) //
                .addAllOrder(orderList);

        return RpcUtils.generateRpcDep(RpcId.QUERY_ORDER_LIST_BY_UNIFORM_SYMBOL_RSP, transactionId, rpcQueryOrderListByUniformSymbolRspBuilder.build().toByteString());
    }

    @Override
    public byte[] getTradeList(CommonReqField commonReq) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        List<TradeField> tradeList = masterTradeCachesService.getTradeList(commonReq.getOperatorId());
        if (tradeList == null) {
            tradeList = new ArrayList<>();
        }

        RpcGetTradeListRsp.Builder rpcGetTradeListRspBuilder = RpcGetTradeListRsp.newBuilder() //
                .setCommonRsp(commonRspBuilder) //
                .addAllTrade(tradeList);

        return RpcUtils.generateRpcDep(RpcId.GET_TRADE_LIST_RSP, transactionId, rpcGetTradeListRspBuilder.build().toByteString());

    }

    @Override
    public byte[] queryTradeByTradeId(CommonReqField commonReq, String tradeId) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        TradeField trade = null;

        if (StringUtils.isBlank(tradeId)) {
            logger.error("参数tradeId缺失");
            commonRspBuilder.setErrorId(1).setErrorMsg("参数tradeId缺失");
        } else {
            trade = masterTradeCachesService.queryTradeByTradeId(commonReq.getOperatorId(), tradeId);
        }

        RpcQueryTradeByTradeIdRsp.Builder rpcQueryTradeByTradeIdRspBuilder = RpcQueryTradeByTradeIdRsp.newBuilder();
        if (trade == null) {
            rpcQueryTradeByTradeIdRspBuilder.setCommonRsp(commonRspBuilder);
        } else {
            rpcQueryTradeByTradeIdRspBuilder.setCommonRsp(commonRspBuilder).setTrade(trade);
        }
        return RpcUtils.generateRpcDep(RpcId.QUERY_TRADE_BY_TRADE_ID_RSP, transactionId, rpcQueryTradeByTradeIdRspBuilder.build().toByteString());
    }

    @Override
    public byte[] queryTradeListByUniformSymbol(CommonReqField commonReq, String uniformSymbol) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        List<TradeField> tradeList = null;

        if (StringUtils.isBlank(uniformSymbol)) {
            logger.error("参数uniformSymbol缺失");
            commonRspBuilder.setErrorId(1).setErrorMsg("参数uniformSymbol缺失");
        } else {
            tradeList = masterTradeCachesService.queryTradeListByUniformSymbol(commonReq.getOperatorId(), uniformSymbol);
        }

        if (tradeList == null) {
            tradeList = new ArrayList<>();
        }

        RpcQueryTradeListByUniformSymbolRsp.Builder rpcQueryTradeListByUniformSymbolRspBuilder = RpcQueryTradeListByUniformSymbolRsp.newBuilder() //
                .setCommonRsp(commonRspBuilder) //
                .addAllTrade(tradeList); //
        return RpcUtils.generateRpcDep(RpcId.QUERY_TRADE_LIST_BY_UNIFORM_SYMBOL_RSP, transactionId, rpcQueryTradeListByUniformSymbolRspBuilder.build().toByteString());
    }

    @Override
    public byte[] queryTradeListByAccountId(CommonReqField commonReq, String accountId) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        List<TradeField> tradeList = null;

        if (StringUtils.isBlank(accountId)) {
            logger.error("参数accountId缺失");
            commonRspBuilder.setErrorId(1).setErrorMsg("参数accountId缺失");
        } else {
            tradeList = masterTradeCachesService.queryTradeListByAccountId(commonReq.getOperatorId(), accountId);
        }

        if (tradeList == null) {
            tradeList = new ArrayList<>();
        }

        RpcQueryTradeListByAccountIdRsp.Builder rpcQueryTradeListByAccountIdRspBuilder = RpcQueryTradeListByAccountIdRsp.newBuilder() //
                .setCommonRsp(commonRspBuilder) //
                .addAllTrade(tradeList);
        return RpcUtils.generateRpcDep(RpcId.QUERY_TRADE_LIST_BY_ACCOUNT_ID_RSP, transactionId, rpcQueryTradeListByAccountIdRspBuilder.build().toByteString());
    }

    @Override
    public byte[] queryTradeListByOrderId(CommonReqField commonReq, String orderId) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        List<TradeField> tradeList = null;

        if (StringUtils.isBlank(orderId)) {
            logger.error("参数orderId缺失");
            commonRspBuilder.setErrorId(1).setErrorMsg("参数orderId缺失");
        } else {
            tradeList = masterTradeCachesService.queryTradeListByOrderId(commonReq.getOperatorId(), orderId);
        }

        if (tradeList == null) {
            tradeList = new ArrayList<>();
        }

        RpcQueryTradeListByOrderIdRsp.Builder rpcQueryTradeListByOrderIdRspBuilder = RpcQueryTradeListByOrderIdRsp.newBuilder() //
                .setCommonRsp(commonRspBuilder) //
                .addAllTrade(tradeList);
        return RpcUtils.generateRpcDep(RpcId.QUERY_TRADE_LIST_BY_ORDER_ID_RSP, transactionId, rpcQueryTradeListByOrderIdRspBuilder.build().toByteString());
    }

    @Override
    public byte[] queryTradeListByOriginOrderId(CommonReqField commonReq, String originOrderId) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        List<TradeField> tradeList = null;

        if (StringUtils.isBlank(originOrderId)) {
            logger.error("参数originOrderId缺失");
            commonRspBuilder.setErrorId(1).setErrorMsg("参数originOrderId缺失");
        } else {
            tradeList = masterTradeCachesService.queryTradeListByOriginOrderId(commonReq.getOperatorId(), originOrderId);
        }

        if (tradeList == null) {
            tradeList = new ArrayList<>();
        }

        RpcQueryTradeListByOriginOrderIdRsp.Builder rpcQueryTradeListByOriginOrderIdRspBuilder = RpcQueryTradeListByOriginOrderIdRsp.newBuilder() //
                .setCommonRsp(commonRspBuilder) //
                .addAllTrade(tradeList);
        return RpcUtils.generateRpcDep(RpcId.QUERY_TRADE_LIST_BY_ORIGIN_ORDER_ID_RSP, transactionId, rpcQueryTradeListByOriginOrderIdRspBuilder.build().toByteString());
    }

    @Override
    public byte[] getPositionList(CommonReqField commonReq) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        List<PositionField> positionList = masterTradeCachesService.getPositionList(commonReq.getOperatorId());

        if (positionList == null) {
            positionList = new ArrayList<>();
        }

        RpcGetPositionListRsp.Builder rpcGetPositionListRspBuilder = RpcGetPositionListRsp.newBuilder() //
                .setCommonRsp(commonRspBuilder) //
                .addAllPosition(positionList);

        return RpcUtils.generateRpcDep(RpcId.GET_POSITION_LIST_RSP, transactionId, rpcGetPositionListRspBuilder.build().toByteString());
    }

    @Override
    public byte[] queryPositionByPositionId(CommonReqField commonReq, String positionId) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        PositionField position = null;

        if (StringUtils.isBlank(positionId)) {
            logger.error("参数positionId缺失");
            commonRspBuilder.setErrorId(1).setErrorMsg("参数positionId缺失");
        } else {
            position = masterTradeCachesService.queryPositionByPositionId(commonReq.getOperatorId(), positionId);
        }

        RpcQueryPositionByPositionIdRsp.Builder rpcQueryPositionByPositionIdRsp = RpcQueryPositionByPositionIdRsp.newBuilder();
        if (position == null) {
            rpcQueryPositionByPositionIdRsp.setCommonRsp(commonRspBuilder);
        } else {
            rpcQueryPositionByPositionIdRsp.setCommonRsp(commonRspBuilder).setPosition(position);
        }

        return RpcUtils.generateRpcDep(RpcId.QUERY_POSITION_BY_POSITION_ID_RSP, transactionId, rpcQueryPositionByPositionIdRsp.build().toByteString());
    }

    @Override
    public byte[] queryPositionListByAccountId(CommonReqField commonReq, String accountId) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        List<PositionField> positionList = null;
        if (StringUtils.isBlank(accountId)) {
            logger.error("参数accountId缺失");
            commonRspBuilder.setErrorId(1).setErrorMsg("参数accountId缺失");
        } else {
            positionList = masterTradeCachesService.queryPositionListByAccountId(commonReq.getOperatorId(), accountId);
        }
        if (positionList == null) {
            positionList = new ArrayList<>();
        }

        RpcGetPositionListRsp.Builder rpcGetPositionListRspBuilder = RpcGetPositionListRsp.newBuilder() //
                .setCommonRsp(commonRspBuilder) //
                .addAllPosition(positionList);
        return RpcUtils.generateRpcDep(RpcId.QUERY_POSITION_LIST_BY_ACCOUNT_ID_RSP, transactionId, rpcGetPositionListRspBuilder.build().toByteString());
    }

    @Override
    public byte[] queryPositionListByUniformSymbol(CommonReqField commonReq, String uniformSymbol) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        List<PositionField> positionList = null;
        if (StringUtils.isBlank(uniformSymbol)) {
            logger.error("参数uniformSymbol缺失");
            commonRspBuilder.setErrorId(1).setErrorMsg("参数uniformSymbol缺失");
        } else {
            positionList = masterTradeCachesService.queryPositionListByUniformSymbol(commonReq.getOperatorId(), uniformSymbol);
        }
        if (positionList == null) {
            positionList = new ArrayList<>();
        }

        RpcQueryPositionListByUniformSymbolRsp.Builder rpcQueryPositionListByUniformSymbolRspBuilder = RpcQueryPositionListByUniformSymbolRsp.newBuilder() //
                .setCommonRsp(commonRspBuilder) //
                .addAllPosition(positionList);
        return RpcUtils.generateRpcDep(RpcId.QUERY_POSITION_LIST_BY_UNIFORM_SYMBOL_RSP, transactionId, rpcQueryPositionListByUniformSymbolRspBuilder.build().toByteString());
    }

    @Override
    public byte[] getAccountList(CommonReqField commonReq) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        List<AccountField> accountList = masterTradeCachesService.getAccountList(commonReq.getOperatorId());

        if (accountList == null) {
            accountList = new ArrayList<>();
        }

        RpcGetAccountListRsp.Builder rpcGetAccountListRspBuilder = RpcGetAccountListRsp.newBuilder().setCommonRsp(commonRspBuilder) //
                .addAllAccount(accountList); //

        return RpcUtils.generateRpcDep(RpcId.GET_ACCOUNT_LIST_RSP, transactionId, rpcGetAccountListRspBuilder.build().toByteString());
    }

    @Override
    public byte[] queryAccountByAccountId(CommonReqField commonReq, String accountId) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        AccountField account = null;

        if (StringUtils.isBlank(accountId)) {
            logger.error("参数accountId缺失");
            commonRspBuilder.setErrorId(1).setErrorMsg("参数accountId缺失");
        } else {
            account = masterTradeCachesService.queryAccountByAccountId(commonReq.getOperatorId(), accountId);
        }

        RpcQueryAccountByAccountIdRsp.Builder rpcQueryAccountByAccountIdRsp = RpcQueryAccountByAccountIdRsp.newBuilder();
        if (account == null) {
            rpcQueryAccountByAccountIdRsp.setCommonRsp(commonRspBuilder);
        } else {
            rpcQueryAccountByAccountIdRsp.setCommonRsp(commonRspBuilder).setAccount(account);
        }
        return RpcUtils.generateRpcDep(RpcId.QUERY_ACCOUNT_BY_ACCOUNT_ID_RSP, transactionId, rpcQueryAccountByAccountIdRsp.build().toByteString());
    }

    @Override
    public byte[] queryAccountListByAccountCode(CommonReqField commonReq, String accountCode) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        List<AccountField> accountList = null;
        if (StringUtils.isBlank(accountCode)) {
            logger.error("参数accountCode缺失");
            commonRspBuilder.setErrorId(1).setErrorMsg("参数accountCode缺失");
        } else {
            accountList = masterTradeCachesService.queryAccountListByAccountCode(commonReq.getOperatorId(), accountCode);
        }
        if (accountList == null) {
            accountList = new ArrayList<>();
        }

        RpcQueryAccountListByAccountCodeRsp.Builder rpcQueryAccountListByAccountCodeRspBuilder = RpcQueryAccountListByAccountCodeRsp.newBuilder() //
                .setCommonRsp(commonRspBuilder) //
                .addAllAccount(accountList);
        return RpcUtils.generateRpcDep(RpcId.QUERY_ACCOUNT_LIST_BY_ACCOUNT_CODE_RSP, transactionId, rpcQueryAccountListByAccountCodeRspBuilder.build().toByteString());
    }

    @Override
    public byte[] getContractList(CommonReqField commonReq) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        List<ContractField> contractList = masterTradeCachesService.getContractList(commonReq.getOperatorId());

        if (contractList == null) {
            contractList = new ArrayList<>();
        }

        RpcGetContractListRsp.Builder rpcGetContractListRspBuilder = RpcGetContractListRsp.newBuilder() //
                .setCommonRsp(commonRspBuilder) //
                .addAllContract(contractList);
        return RpcUtils.generateRpcDep(RpcId.GET_CONTRACT_LIST_RSP, transactionId, rpcGetContractListRspBuilder.build().toByteString());

    }

    @Override
    public byte[] queryContractByUniformSymbol(CommonReqField commonReq, String uniformSymbol) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        ContractField contract = null;

        if (StringUtils.isBlank(uniformSymbol)) {
            logger.error("参数contractId缺失");
            commonRspBuilder.setErrorId(1).setErrorMsg("合约ID缺失");
        } else {
            contract = masterTradeCachesService.queryContractByUniformSymbol(commonReq.getOperatorId(), uniformSymbol);
        }

        RpcQueryContractByUniformSymbolRsp.Builder rpcQueryContractByUniformSymbolRsp = RpcQueryContractByUniformSymbolRsp.newBuilder();
        if (contract == null) {
            rpcQueryContractByUniformSymbolRsp.setCommonRsp(commonRspBuilder);
        } else {
            rpcQueryContractByUniformSymbolRsp.setCommonRsp(commonRspBuilder).setContract(contract);
        }
        return RpcUtils.generateRpcDep(RpcId.QUERY_CONTRACT_BY_UNIFORM_SYMBOL_RSP, transactionId, rpcQueryContractByUniformSymbolRsp.build().toByteString());
    }

    @Override
    public byte[] syncSlaveNodeRuntimeData(String sessionId, CommonReqField commonReq, List<GatewayField> gatewayList) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        Integer nodeId = webSocketServerHandler.getNodeIdBySessionId(sessionId);

        List<GatewaySettingField> gatewaySettingList = masterSystemService.queryGatewaySettingList(commonReq, gatewayList, nodeId);
        if (gatewaySettingList == null) {
            gatewaySettingList = new ArrayList<>();
        }

        List<ContractField> contractList = masterTradeExecuteService.getSubscribedContract();
        if (contractList == null) {
            contractList = new ArrayList<>();
        }

        List<ContractField> mdrContractList = marketDataRecordingService.getSubscribedContractFieldList();

        if (mdrContractList != null) {
            contractList.addAll(mdrContractList);
        }

        RpcSyncSlaveNodeRuntimeDataRsp.Builder rpcQueryGatewaySettingListRspBuilder = RpcSyncSlaveNodeRuntimeDataRsp.newBuilder() //
                .setCommonRsp(commonRspBuilder) //
                .addAllSubscribedContract(contractList).addAllGatewaySetting(gatewaySettingList); //
        return RpcUtils.generateRpcDep(RpcId.SYNC_SLAVE_NODE_RUNTIME_DATA_RSP, transactionId, rpcQueryGatewaySettingListRspBuilder.build().toByteString());

    }

    @Override
    public byte[] getTickList(String sessionId, CommonReqField commonReq) {
        String transactionId = commonReq.getTransactionId();

        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        List<TickField> tickList = masterTradeCachesService.getTickList(commonReq.getOperatorId());

        List<TickField> resultTickList = new ArrayList<>();

        if (StringUtils.isNotBlank(sessionId)) {
            Set<String> subscribeKeySet = masterTradeExecuteService.getSubscribeKeySet(sessionId);

            if (tickList != null && subscribeKeySet != null && subscribeKeySet.size() > 0) {
                for (TickField tick : tickList) {
                    String subscribeKey1 = tick.getUniformSymbol();
                    String subscribeKey2 = tick.getUniformSymbol() + "@" + tick.getGatewayId();

                    if (subscribeKeySet.contains(subscribeKey1) || subscribeKeySet.contains(subscribeKey2)) {
                        resultTickList.add(tick);
                    }

                }
            }
        }

        RpcGetTickListRsp.Builder rpcGetTickListRspBuilder = RpcGetTickListRsp.newBuilder() //
                .setCommonRsp(commonRspBuilder) //
                .addAllTick(resultTickList);
        return RpcUtils.generateRpcDep(RpcId.GET_TICK_LIST_RSP, transactionId, rpcGetTickListRspBuilder.build().toByteString());

    }

    @Override
    public byte[] queryDBBarList(CommonReqField commonReq, long startTimestamp, long endTimestamp, String uniformSymbol, BarPeriodEnum barPeriod, MarketDataDBTypeEnum marketDataDBType) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        List<BarField> barList = null;

        if (MarketDataDBTypeEnum.MDDT_MIX.equals(marketDataDBType)) {
            barList = marketDataService.queryBarList(startTimestamp, endTimestamp, uniformSymbol, barPeriod);
        } else if (MarketDataDBTypeEnum.MDDT_TD.equals(marketDataDBType)) {
            barList = todayMarketDataService.queryBarList(startTimestamp, endTimestamp, uniformSymbol, barPeriod);
        } else if (MarketDataDBTypeEnum.MDDT_HIST.equals(marketDataDBType)) {
            barList = historyMarketDataService.queryBarList(startTimestamp, endTimestamp, uniformSymbol, barPeriod);
        }

        if (barList == null) {
            barList = new ArrayList<>();
        }

        RpcQueryDBBarListRsp.Builder rpcQueryDBBarListRspBuilder = RpcQueryDBBarListRsp.newBuilder() //
                .setCommonRsp(commonRspBuilder) //
                .addAllBar(barList);
        return RpcUtils.generateRpcDep(RpcId.QUERY_DB_BAR_LIST_RSP, transactionId, rpcQueryDBBarListRspBuilder.build().toByteString());
    }

    @Override
    public byte[] queryDBTickList(CommonReqField commonReq, long startTimestamp, long endTimestamp, String uniformSymbol, MarketDataDBTypeEnum marketDataDBType) {
        String transactionId = commonReq.getTransactionId();


        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        List<TickField> tickList = null;

        if (MarketDataDBTypeEnum.MDDT_MIX.equals(marketDataDBType)) {
            tickList = marketDataService.queryTickList(startTimestamp, endTimestamp, uniformSymbol);
        } else if (MarketDataDBTypeEnum.MDDT_TD.equals(marketDataDBType)) {
            tickList = todayMarketDataService.queryTickList(startTimestamp, endTimestamp, uniformSymbol);
        } else if (MarketDataDBTypeEnum.MDDT_HIST.equals(marketDataDBType)) {
            tickList = historyMarketDataService.queryTickList(startTimestamp, endTimestamp, uniformSymbol);
        }

        if (tickList == null) {
            tickList = new ArrayList<>();
        }

        RpcQueryDBTickListRsp.Builder rpcQueryDBTickListRspBuilder = RpcQueryDBTickListRsp.newBuilder() //
                .setCommonRsp(commonRspBuilder) //
                .addAllTick(tickList);
        return RpcUtils.generateRpcDep(RpcId.QUERY_DB_TICK_LIST_RSP, transactionId, rpcQueryDBTickListRspBuilder.build().toByteString());
    }

    @Override
    public byte[] queryVolumeBarList(CommonReqField commonReq, long startTimestamp, long endTimestamp, String uniformSymbol, int volume) {
        String transactionId = commonReq.getTransactionId();

        CommonRspField.Builder commonRspBuilder = CommonRspField.newBuilder() //
                .setTransactionId(transactionId) //
                .setErrorId(0);

        List<BarField> barList = null;
        List<TickField> tickList = marketDataService.queryTickList(startTimestamp, endTimestamp, uniformSymbol);

        if (tickList != null && !tickList.isEmpty()) {
            barList = BarUtils.generateVolBar(volume, tickList);
        }
        if (barList == null) {
            barList = new ArrayList<>();
        }

        RpcQueryVolumeBarListRsp.Builder rpcQueryVolumeBarListRsp = RpcQueryVolumeBarListRsp.newBuilder() //
                .setCommonRsp(commonRspBuilder) //
                .addAllBar(barList);
        return RpcUtils.generateRpcDep(RpcId.QUERY_VOLUME_BAR_LIST_RSP, transactionId, rpcQueryVolumeBarListRsp.build().toByteString());
    }

}
