package com.ran.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.ran.domain.PassagewayHarmType;

public interface PassagewayHarmTypeMapper {
    int deleteByPrimaryKey(Integer harmTypeId);

    int insert(PassagewayHarmType record);

    int insertSelective(PassagewayHarmType record);

    PassagewayHarmType selectByPrimaryKey(Integer harmTypeId);

    int updateByPrimaryKeySelective(PassagewayHarmType record);

    int updateByPrimaryKey(PassagewayHarmType record);

    List<PassagewayHarmType> selectAll();


}
