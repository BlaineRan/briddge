package com.ran.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.ran.domain.PierCheckData;

public interface PierCheckDataMapper {
    int deleteByPrimaryKey(Integer pierCheckDataId);

    int insert(PierCheckData record);

    int insertSelective(PierCheckData record);

    PierCheckData selectByPrimaryKey(Integer pierCheckDataId);

    int updateByPrimaryKeySelective(PierCheckData record);

    int updateByPrimaryKey(PierCheckData record);

    List<PierCheckData> selectAll();


}
