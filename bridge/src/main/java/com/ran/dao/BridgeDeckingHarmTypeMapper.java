package com.ran.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.ran.domain.BridgeDeckingHarmType;

public interface BridgeDeckingHarmTypeMapper {
    int deleteByPrimaryKey(Integer harmTypeId);

    int insert(BridgeDeckingHarmType record);

    int insertSelective(BridgeDeckingHarmType record);

    BridgeDeckingHarmType selectByPrimaryKey(Integer harmTypeId);

    int updateByPrimaryKeySelective(BridgeDeckingHarmType record);

    int updateByPrimaryKey(BridgeDeckingHarmType record);

    List<BridgeDeckingHarmType> selectAll();

    List<BridgeDeckingHarmType> selectHarmTypeByBridgeTypeId(int bridgeTypeId);
}
