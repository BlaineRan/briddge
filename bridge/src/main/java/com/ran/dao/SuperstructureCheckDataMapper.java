package com.ran.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.ran.domain.SuperstructureCheckData;

public interface SuperstructureCheckDataMapper {
    int deleteByPrimaryKey(Integer checkDataId);

    int insert(SuperstructureCheckData record);

    int insertSelective(SuperstructureCheckData record);

    SuperstructureCheckData selectByPrimaryKey(Integer checkDataId);

    int updateByPrimaryKeySelective(SuperstructureCheckData record);

    int updateByPrimaryKey(SuperstructureCheckData record);

    List<SuperstructureCheckData> selectAll();


}
