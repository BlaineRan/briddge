package com.ran.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.ran.domain.BridgeMap;

public interface BridgeMapMapper {
    int deleteByPrimaryKey(Integer bridgeId);

    int insert(BridgeMap record);

    int insertSelective(BridgeMap record);

    BridgeMap selectByPrimaryKey(Integer bridgeId);

    int updateByPrimaryKeySelective(BridgeMap record);

    int updateByPrimaryKey(BridgeMap record);

    List<BridgeMap> selectAll();


}
