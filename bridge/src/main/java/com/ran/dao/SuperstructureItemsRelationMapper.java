package com.ran.dao;

import com.ran.domain.SuperstructureItemsRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SuperstructureItemsRelationMapper {
    int insert(SuperstructureItemsRelation record);

    int insertSelective(SuperstructureItemsRelation record);

    List<SuperstructureItemsRelation> selectByElementId(Integer elementId);

    List<SuperstructureItemsRelation> selectByCheckItemId(Integer checkItemId);

    List<SuperstructureItemsRelation> selectAll();

    int selectElementIdByBridgeTypeIdAndItemId(@Param("bridgeTypeId") int bridgeTypeId, @Param("checkItemId") int checkItemId);
}
