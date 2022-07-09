package com.ran.dao;

import com.ran.domain.BridgeDeckingCheckData;

import java.util.List;

public interface BridgeDeckingCheckDataMapper {
    int deleteByPrimaryKey(Integer checkDataId);

    int insert(BridgeDeckingCheckData record);

    int insertSelective(BridgeDeckingCheckData record);

    BridgeDeckingCheckData selectByPrimaryKey(Integer checkDataId);

    int updateByPrimaryKeySelective(BridgeDeckingCheckData record);

    int updateByPrimaryKey(BridgeDeckingCheckData record);

    List<BridgeDeckingCheckData> selectAll();
}
