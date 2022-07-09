package com.ran.dao;

import com.ran.domain.SubstructureElementTypeRelation;
import com.ran.domain.SuperstructureElementTypeRelation;

import java.util.List;

public interface SuperstructureElementTypeRelationMapper {
    int insert(SuperstructureElementTypeRelation record);

    int insertSelective(SuperstructureElementTypeRelation record);

    List<SuperstructureElementTypeRelation> selectByElementId(Integer elementId);

    List<SuperstructureElementTypeRelation> selectByBridgeTypeId(Integer bridgeTypeId);

    List<SuperstructureElementTypeRelation> selectAll();

}
