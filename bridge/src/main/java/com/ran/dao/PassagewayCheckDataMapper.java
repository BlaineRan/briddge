package com.ran.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.ran.domain.PassagewayCheckData;

public interface PassagewayCheckDataMapper {
    int deleteByPrimaryKey(Integer checkDataId);

    int insert(PassagewayCheckData record);

    int insertSelective(PassagewayCheckData record);

    PassagewayCheckData selectByPrimaryKey(Integer checkDataId);

    int updateByPrimaryKeySelective(PassagewayCheckData record);

    int updateByPrimaryKey(PassagewayCheckData record);

    List<PassagewayCheckData> selectAll();


}
