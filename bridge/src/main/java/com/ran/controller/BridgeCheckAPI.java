package com.ran.controller;

import com.ran.controller.bridgeCheck.DailyCheckRecordItem;
import com.ran.domain.DailyCheckRecord;
import com.ran.domain.DailyCheckSpecific;
import com.ran.service.BridgeCheckService;
import com.ran.service.BridgeService;
import com.ran.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@RequestMapping("bridgeCheck")
@CrossOrigin
@Controller
public class BridgeCheckAPI {
    @Autowired
    BridgeCheckService bridgeCheckService;

    @Autowired
    BridgeService bridgeService;

    @Autowired
    UserService userService;

    /**
     * POST 根据桥梁id分页查询日常巡检记录
     * */
    @RequestMapping("getDailyRecordByBridgeId")
    @ResponseBody
    Map<String,Object> getDailyRecordByBridgeId(@RequestBody(required = false)Map<String,Integer> data){
        int bridgeId = data.get("bridgeId");
        int current = data.get("current");
        int pageSize = data.get("pageSize");
        List<DailyCheckRecord> recordList = bridgeCheckService.getDailyRecordBtBridgeId(bridgeId,current,pageSize);
        List<DailyCheckRecordItem> resultList = new ArrayList<>();
        for(DailyCheckRecord r : recordList){
            String bridgeName = bridgeService.queryOneBridge(r.getBridgeId()).getBridgeName();
            String userName = userService.queryUserById(r.getInspectorId()).getUserName();
            resultList.add(new DailyCheckRecordItem(r.getDailyCheckId(),bridgeName,r.getInProtectConstruct(),r.getOtherHarm(),userName,r.getCheckDate(),r.getMaintainAdvice()));
        }

        int total = bridgeCheckService.countDailyByBridgeId(bridgeId);
        Map<String,Object> result = new HashMap<>();
        result.put("data",resultList);
        result.put("total",total);
        result.put("success",true);

        return result;
    }

    @RequestMapping("getDailySpec")
    @ResponseBody
    Map<String,Object> getDailyRecordSpec(@RequestBody(required = false) Map<String,Integer> data){
        int recordId = data.get("currentRecordId");
        List<DailyCheckSpecific> resultList = bridgeCheckService.getDailySpec(recordId);
        Map<String,Object> result = new HashMap<>();
        result.put("data",resultList);
        return result;
    }

    @RequestMapping("addDailyCheck")
    @ResponseBody
    @Transactional
    String addDailyCheck(@RequestBody(required = false) Map<String,Object> data){
        Integer bridgeId = (Integer)data.get("bridgeId");
        String inProtectConstruct = (String)data.get("inProtectConstruct");
        String otherHarm = (String)data.get("otherHarm");
        String maintainAdvice = (String)data.get("maintainAdvice");
        List<Map<String,String>> dataList = (List<Map<String,String>>)data.get("checkItems");

        int userId = userService.queryUserActive().getUserId();

        int recordId = bridgeCheckService.addDailyRecord(new DailyCheckRecord(-1,bridgeId,inProtectConstruct,otherHarm,userId,String.valueOf(System.currentTimeMillis()),maintainAdvice));
        for(Map<String,String> m : dataList){
            String checkItem = m.get("checkItem");
            String complete = m.get("complete");
            String harmType = m.get("harmType");
            String harmDegree = m.get("harmDegree");
            String harmPos = m.get("harmPos");
            String tips = m.get("tips");
            DailyCheckSpecific dailyCheckSpecific = new DailyCheckSpecific(-1,recordId,checkItem,complete,harmType,harmDegree,harmPos,tips);
            bridgeCheckService.addDailySpec(dailyCheckSpecific);
        }

        return "success";
    }
}
