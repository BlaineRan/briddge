package com.ran.dao;

import com.ran.domain.BridgeDeckingElement;

import java.util.List;

public interface BridgeDeckingElementMapper {
    int deleteByPrimaryKey(Integer elementId);

    int insert(BridgeDeckingElement record);

    int insertSelective(BridgeDeckingElement record);

    BridgeDeckingElement selectByPrimaryKey(Integer elementId);

    int updateByPrimaryKeySelective(BridgeDeckingElement record);

    int updateByPrimaryKey(BridgeDeckingElement record);

    List<BridgeDeckingElement> selectAll();
}
