package com.ran.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.ran.dao.BridgeMapMapper;
import com.ran.domain.BridgeMap;
import com.ran.service.BridgeMapService;
@Service
public class BridgeMapServiceImpl implements BridgeMapService{

    @Resource
    private BridgeMapMapper bridgeMapMapper;

    @Override
    public int deleteByPrimaryKey(Integer bridgeId) {
        return bridgeMapMapper.deleteByPrimaryKey(bridgeId);
    }

    @Override
    public int insert(BridgeMap record) {
        return bridgeMapMapper.insert(record);
    }

    @Override
    public int insertSelective(BridgeMap record) {
        return bridgeMapMapper.insertSelective(record);
    }

    @Override
    public BridgeMap selectByPrimaryKey(Integer bridgeId) {
        return bridgeMapMapper.selectByPrimaryKey(bridgeId);
    }

    @Override
    public int updateByPrimaryKeySelective(BridgeMap record) {
        return bridgeMapMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BridgeMap record) {
        return bridgeMapMapper.updateByPrimaryKey(record);
    }

}
