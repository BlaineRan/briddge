package com.ran.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.ran.domain.BridgeType;

public interface BridgeTypeMapper {
    int deleteByPrimaryKey(Integer bridgeTypeId);

    int insert(BridgeType record);

    int insertSelective(BridgeType record);

    BridgeType selectByPrimaryKey(Integer bridgeTypeId);

    int updateByPrimaryKeySelective(BridgeType record);

    int updateByPrimaryKey(BridgeType record);

    int selectBridgeTypeIdByName(String bridgeTypeName);

    List<BridgeType> selectAll();


}
