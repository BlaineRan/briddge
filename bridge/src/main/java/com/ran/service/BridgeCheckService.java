package com.ran.service;

import com.ran.dao.DailyCheckRecordMapper;
import com.ran.dao.DailyCheckSpecificMapper;
import com.ran.domain.DailyCheckRecord;
import com.ran.domain.DailyCheckSpecific;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BridgeCheckService {
    public static final double weight1 = 0.23;
    public static final double weight2 = 0.47;
    public static final double weight3 = 0.71;
    @Autowired
    DailyCheckRecordMapper dailyCheckRecordMapper;

    @Autowired
    DailyCheckSpecificMapper dailyCheckSpecificMapper;
    /**
     * 根据桥梁编号查询日常巡检记录
     * */
    public List<DailyCheckRecord> getDailyRecordBtBridgeId(int bridgeId, int current, int pageSize){
        current = (current-1) * pageSize;
        return dailyCheckRecordMapper.selectAllByBridgeId(bridgeId,current,pageSize);
    }

    /**
     * 根据桥梁编号查记录条数
     * */
    public int countDailyByBridgeId(int bridgeId){
        return dailyCheckRecordMapper.countByBridgeId(bridgeId);
    }

    /**
     * 根据日常记录id查详细记录
     * */
    public List<DailyCheckSpecific> getDailySpec(int dailyCheckId){
        return dailyCheckSpecificMapper.selectAllByDailyCheckId(dailyCheckId);
    }

    /**
     * 插入一条日常巡检记录
     * */
    public int addDailyRecord(DailyCheckRecord dailyCheckRecord){
        int newId = dailyCheckRecordMapper.countMaxRecordId();
        dailyCheckRecord.setDailyCheckId(newId+1);
        dailyCheckRecordMapper.insert(dailyCheckRecord);
        return newId;
    }

    /**
     * 插入一条日常巡检详细记录
     * */
    public int addDailySpec(DailyCheckSpecific dailyCheckSpecific){
        int newId = dailyCheckSpecificMapper.countMaxPrimaryKey();
        dailyCheckSpecific.setSpecificId(newId+1);
        return dailyCheckSpecificMapper.insert(dailyCheckSpecific);
    }
}
