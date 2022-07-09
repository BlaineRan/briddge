package com.ran.controller;

import com.ran.controller.bridgeCheck.PeriodicCheckRecordItem;
import com.ran.dao.BridgeMapper;
import com.ran.dao.PeriodicCheckRecordMapper;
import com.ran.dao.UserMapper;
import com.ran.domain.Bridge;
import com.ran.domain.PeriodicCheckRecord;
import com.ran.service.BridgeService;
import com.ran.service.PeriodicCheckService;
import com.ran.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("pCheck")
@CrossOrigin(allowCredentials = "true")
public class PeriodicCheckAPI {
    @Autowired
    PeriodicCheckService periodicCheckService;
    @Autowired
    UserService userService;
    @Autowired
    BridgeService bridgeService;

    @RequestMapping("getPRecordByBridgeId")
    @ResponseBody
    Map<String,Object> getPRecordByBridgeId(@RequestBody(required = false) Map<String,Integer> data){

        int bridgeId = data.get("bridgeId");
        int current = data.get("current");
        int pageSize = data.get("pageSize");

        current = (current - 1) * pageSize;

        List<PeriodicCheckRecord> recordList = periodicCheckService.getPeriodicCheckRecordsByBridgeId(current,pageSize,bridgeId);
        List<PeriodicCheckRecordItem> resultList = new ArrayList<>();
        for(PeriodicCheckRecord record : recordList){
            String userName = userService.queryUserById(record.getInspectorId()).getUserName();
            resultList.add(new PeriodicCheckRecordItem(record.getPeriodicCheckId(),record.getBridgeId(),record.getBci(),record.getBsi(),record.getPuci(),userName,record.getCheckTime()));
        }
        int total = periodicCheckService.countPeriodicCheckByBridgeId(bridgeId);

        Map<String,Object> result = new HashMap<>();
        result.put("data",resultList);
        result.put("total",total);
        result.put("success",true);
        return result;
    }

}
