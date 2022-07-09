package com.ran.dao;

import com.ran.domain.BridgeDeckingElementTypeRelation;
import com.ran.domain.BridgeDeckingHarmType;

import java.util.List;

public interface BridgeDeckingElementTypeRelationMapper {
    int insert(BridgeDeckingElementTypeRelation record);

    int insertSelective(BridgeDeckingElementTypeRelation record);

    List<BridgeDeckingElementTypeRelation> selectByElementId(Integer elementId);

    List<BridgeDeckingElementTypeRelation> selectByBridgeTypeId(Integer bridgeTypeId);

    List<BridgeDeckingElementTypeRelation> selectAll();

}
