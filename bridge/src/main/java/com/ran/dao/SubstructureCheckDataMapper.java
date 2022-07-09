package com.ran.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.ran.domain.SubstructureCheckData;

public interface SubstructureCheckDataMapper {
    int deleteByPrimaryKey(Integer checkDataId);

    int insert(SubstructureCheckData record);

    int insertSelective(SubstructureCheckData record);

    SubstructureCheckData selectByPrimaryKey(Integer checkDataId);

    int updateByPrimaryKeySelective(SubstructureCheckData record);

    int updateByPrimaryKey(SubstructureCheckData record);

    List<SubstructureCheckData> selectAll();


}
