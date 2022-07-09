package com.ran.dao;

import com.ran.domain.SubstructureElementTypeRelation;

import java.util.List;

public interface SubstructureElementTypeRelationMapper {
    int insert(SubstructureElementTypeRelation record);

    int insertSelective(SubstructureElementTypeRelation record);

    List<SubstructureElementTypeRelation> selectByElementId(Integer elementId);

    List<SubstructureElementTypeRelation> selectByBridgeTypeId(Integer bridgeTypeId);

    List<SubstructureElementTypeRelation> selectAll();
}
