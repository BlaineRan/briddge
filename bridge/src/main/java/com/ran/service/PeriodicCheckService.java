package com.ran.service;

import com.ran.dao.PeriodicCheckRecordMapper;
import com.ran.domain.PeriodicCheckRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeriodicCheckService {

    @Autowired
    PeriodicCheckRecordMapper periodicCheckRecordMapper;

    /**
     * 根据bridgeID分页查询定期检查记录
     * */
    public List<PeriodicCheckRecord> getPeriodicCheckRecordsByBridgeId(int current,int pageSize, int bridgeId){
        return periodicCheckRecordMapper.selectAllByBridgeId(bridgeId,current,pageSize);
    }

    /**
     * 查询定期检查记录总数
     * */
    public int countPeriodicCheckByBridgeId(int bridgeId){
        return periodicCheckRecordMapper.countByBridgeId(bridgeId);
    }
}
