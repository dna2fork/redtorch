package xyz.redtorch.node.master.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import xyz.redtorch.node.master.dao.FavoriteContractDao;
import xyz.redtorch.node.master.po.ContractPo;
import xyz.redtorch.node.master.service.FavoriteContractService;
import xyz.redtorch.node.master.service.MasterTradeCachesService;
import xyz.redtorch.node.master.util.BeanUtils;
import xyz.redtorch.pb.CoreField.ContractField;

import java.util.List;

@Service
public class FavoriteContractServiceImpl implements FavoriteContractService {

    private static final Logger logger = LoggerFactory.getLogger(FavoriteContractServiceImpl.class);

    @Autowired
    private FavoriteContractDao favoriteContractDao;

    @Autowired
    private MasterTradeCachesService masterTradeCachesService;

    @Value("rt.master.operatorId")
    private String masterOperatorId;

    @Override
    public List<ContractPo> getContractListByUsername(String username) {
        if (StringUtils.isBlank(username)) {
            logger.error("根据用户名获取常用合约列表错误,参数username缺失");
            throw new IllegalArgumentException("根据用户名获取常用合约列表错误,参数username缺失");
        }
        return favoriteContractDao.queryContractListByUsername(username);
    }

    @Override
    public void deleteContractByUsername(String username) {
        if (StringUtils.isBlank(username)) {
            logger.error("根据用户名删除合约错误,参数username缺失");
            throw new IllegalArgumentException("根据用户名删除合约错误,参数username缺失");
        }
        favoriteContractDao.deleteContractByUsername(username);
    }

    @Override
    public void deleteContractByUsernameAndUniformSymbol(String username, String uniformSymbol) {
        if (StringUtils.isBlank(username)) {
            logger.error("根据用户名和统一合约标识删除合约错误,参数username缺失");
            throw new IllegalArgumentException("根据用户名和统一合约标识删除合约错误,参数username缺失");
        }
        if (StringUtils.isBlank(uniformSymbol)) {
            logger.error("根据用户名和统一合约标识删除合约错误,参数uniformSymbol缺失");
            throw new IllegalArgumentException("根据用户名和统一合约标识删除合约错误,参数uniformSymbol缺失");
        }
        favoriteContractDao.deleteContractByUsernameAndUniformSymbol(username, uniformSymbol);
    }

    @Override
    public void upsertContractByUsernameAndUniformSymbol(String username, String uniformSymbol) {

        if (StringUtils.isBlank(username)) {
            logger.error("根据用户名和统一合约标识更新或新增合约错误,参数username缺失");
            throw new IllegalArgumentException("根据用户名和统一合约标识更新或新增合约错误,参数username缺失");
        }

        if (StringUtils.isNotBlank(uniformSymbol)) {
            ContractField contract = masterTradeCachesService.queryContractByUniformSymbol(masterOperatorId, uniformSymbol);
            if (contract == null) {
                logger.error("根据用户名和统一合约标识更新或新增合约错误,未找到合约");
                throw new IllegalArgumentException("根据用户名和统一合约标识更新或新增合约错误,未找到合约");
            }

            ContractPo contractPo = BeanUtils.contractFieldToContractPo(contract);

            favoriteContractDao.upsertContractByUsernameAndUniformSymbol(username, contractPo);
        } else {
            logger.error("根据用户名和统一合约标识更新或新增合约错误,参数uniformSymbol缺失");
            throw new IllegalArgumentException("根据用户名和统一合约标识更新或新增合约错误,参数uniformSymbol缺失");
        }

    }
}
