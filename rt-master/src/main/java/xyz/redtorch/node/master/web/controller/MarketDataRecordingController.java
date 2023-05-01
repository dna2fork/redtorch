package xyz.redtorch.node.master.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.redtorch.common.constant.CommonConstant;
import xyz.redtorch.common.web.vo.RequestVo;
import xyz.redtorch.common.web.vo.ResponseVo;
import xyz.redtorch.node.master.po.ContractPo;
import xyz.redtorch.node.master.po.UserPo;
import xyz.redtorch.node.master.service.MarketDataRecordingService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("${rt.master.apiBasePath}/management/marketDataRecording")
public class MarketDataRecordingController {
    private static final Logger logger = LoggerFactory.getLogger(MarketDataRecordingController.class);

    @Autowired
    private MarketDataRecordingService marketDataRecordingService;

    @RequestMapping(value = {"/getContractList"})
    @ResponseBody
    public ResponseVo<List<ContractPo>> getContractList(HttpServletRequest request) {
        ResponseVo<List<ContractPo>> responseVo = new ResponseVo<>();
        try {
            UserPo user = (UserPo) request.getAttribute(CommonConstant.KEY_USER_PO);
            if (user.isCanReadMarketDataRecording()) {
                List<ContractPo> contractList = marketDataRecordingService.getContractList();
                responseVo.setVoData(contractList);
            } else {
                logger.error("查询合约列表发生错误,用户{}没有权限", user.getUsername());
                responseVo.setStatus(false);
                responseVo.setMessage("查询合约列表发生错误,用户没有权限");
            }
        } catch (Exception e) {
            logger.error("查询合约列表发生错误", e);
            responseVo.setStatus(false);
            responseVo.setMessage(e.getMessage());
        }
        return responseVo;
    }

    @RequestMapping(value = {"/addContractByUniformSymbol"})
    @ResponseBody
    public ResponseVo<String> addContractByUniformSymbol(HttpServletRequest request, @RequestBody RequestVo<String> requestVo) {
        ResponseVo<String> responseVo = new ResponseVo<>();
        try {
            UserPo user = (UserPo) request.getAttribute(CommonConstant.KEY_USER_PO);
            if (user.isCanWriteMarketDataRecording()) {
                logger.info("用户{}新增合约,合约统一标识:{}", user.getUsername(), requestVo.getVoData());
                marketDataRecordingService.addContractByUniformSymbol(requestVo.getVoData());
            } else {
                logger.error("根据统一合约标识新增合约错误,用户{}没有权限", user.getUsername());
                responseVo.setStatus(false);
                responseVo.setMessage("根据统一合约标识新增合约错误,用户没有权限");
            }
        } catch (Exception e) {
            logger.error("根据统一合约标识新增合约错误", e);
            responseVo.setStatus(false);
            responseVo.setMessage(e.getMessage());
        }
        return responseVo;
    }

    @RequestMapping(value = {"/deleteContractByUniformSymbol"})
    @ResponseBody
    public ResponseVo<String> deleteGatewayByGatewayId(HttpServletRequest request, @RequestBody RequestVo<String> requestVo) {
        ResponseVo<String> responseVo = new ResponseVo<>();
        try {
            UserPo user = (UserPo) request.getAttribute(CommonConstant.KEY_USER_PO);
            if (user.isCanWriteGateway()) {
                logger.info("用户{}删除合约,合约统一标识:{}", user.getUsername(), requestVo.getVoData());
                marketDataRecordingService.deleteContractByUniformSymbol(requestVo.getVoData());
            } else {
                logger.error("据统一合约标识删除合约错误,用户{}没有权限", user.getUsername());
                responseVo.setStatus(false);
                responseVo.setMessage("据统一合约标识删除合约错误,用户没有权限");
            }
        } catch (Exception e) {
            logger.error("据统一合约标识删除合约错误", e);
            responseVo.setStatus(false);
            responseVo.setMessage(e.getMessage());
        }
        return responseVo;
    }

}
