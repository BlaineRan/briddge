package com.ran.dao;

import com.ran.domain.PassagewayElementTypeRelation;

import java.util.List;

public interface PassagewayElementTypeRelationMapper {
    int insert(PassagewayElementTypeRelation record);

    int insertSelective(PassagewayElementTypeRelation record);

    List<PassagewayElementTypeRelation> selectByElementId(Integer elementId);

    List<PassagewayElementTypeRelation> selectByBridgeTypeId(Integer bridgeTypeId);

    List<PassagewayElementTypeRelation> selectAll();
}
