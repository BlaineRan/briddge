package com.ran.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.ran.domain.PassagewayElement;

public interface PassagewayElementMapper {
    int deleteByPrimaryKey(Integer elementId);

    int insert(PassagewayElement record);

    int insertSelective(PassagewayElement record);

    PassagewayElement selectByPrimaryKey(Integer elementId);

    int updateByPrimaryKeySelective(PassagewayElement record);

    int updateByPrimaryKey(PassagewayElement record);

    List<PassagewayElement> selectAll();


}
