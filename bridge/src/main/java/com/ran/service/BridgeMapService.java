package com.ran.service;

import com.ran.domain.BridgeMap;
public interface BridgeMapService{


    int deleteByPrimaryKey(Integer bridgeId);

    int insert(BridgeMap record);

    int insertSelective(BridgeMap record);

    BridgeMap selectByPrimaryKey(Integer bridgeId);

    int updateByPrimaryKeySelective(BridgeMap record);

    int updateByPrimaryKey(BridgeMap record);

}
