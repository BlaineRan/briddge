package com.ran.controller;

import com.ran.controller.bridge.BridgeItem;
import com.ran.dao.BridgeMapMapper;
import com.ran.dao.PiersMapper;
import com.ran.dao.SpansMapper;
import com.ran.domain.Bridge;
import com.ran.domain.BridgeMap;
import com.ran.domain.Spans;
import com.ran.service.BridgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/bridge")
@CrossOrigin(allowCredentials = "true")
public class BridgeAPI {

    @Autowired
    BridgeService bridgeService;

    @Autowired
    SpansMapper spansMapper;

    @Autowired
    PiersMapper piersMapper;

    @Autowired
    BridgeMapMapper bridgeMapMapper;
    /**
     * POST 分页查询桥梁列表
     * */
    @RequestMapping("/getListPaging")
    @ResponseBody
    Map<String, Object> getBridgeListPaging(@RequestBody(required = true) Map<String, Object> data) {
        Map<String,String> queryData = new HashMap<>();
        queryData.put("bridgeId",(String)data.get("bridgeId"));
        queryData.put("bridgeName",(String)data.get("bridgeName"));
        queryData.put("bridgeType",(String)data.get("bridgeType"));
        queryData.put("chargeName",(String)data.get("chargeName"));
        queryData.put("bciLevel",(String)data.get("bciLevel"));
        queryData.put("bsiLevel",(String)data.get("bsiLevel"));
        queryData.put("puciLevel",(String)data.get("puciLevel"));

        List<Bridge> bridgeList = bridgeService.queryPageBridge((Integer)data.get("current"), (Integer)data.get("pageSize"),queryData);
        List<BridgeItem> bridgeItemList = new ArrayList<>();
        for (Bridge bridge : bridgeList) {
            bridgeItemList.add(bridgeService.transferBridgeData(bridge));
        }
        Map<String, Object> result = new HashMap<>();
        result.put("data", bridgeItemList);
        result.put("total", bridgeService.queryNum(queryData));
        result.put("success", true);
        return result;
    }

    /**
     * POST 查询所有桥梁列表
     * */
    @RequestMapping("/getList")
    @ResponseBody
    Map<String, Object> getBridgeList() {
        List<Bridge> bridgeList = bridgeService.queryAllBridge();
        List<BridgeItem> bridgeItemList = new ArrayList<>();
        for (Bridge bridge : bridgeList) {
            bridgeItemList.add(bridgeService.transferBridgeData(bridge));
        }
        Map<String, Object> result = new HashMap<>();
        result.put("data", bridgeItemList);
        result.put("total", bridgeItemList.size());
        result.put("success", true);
        return result;
    }

    /**
     * POST 根据id查询单个桥
     * */
    @RequestMapping("/getBridge")
    @ResponseBody
    Bridge getBridgeById(@RequestBody(required = false) Map<String,Integer> data){
        return bridgeService.queryOneBridge(data.get("bridgeId"));
    }

    /**
     * POST 批量删除
     * */
    @RequestMapping("/deleteMany")
    @ResponseBody
    String deleteBridges(@RequestBody(required = false) Map<String, List<Integer>> data) {
        List<Integer> bridgeIdList = data.get("bridgeId");
        for (int i : bridgeIdList) {
            int status = bridgeService.deleteBridge(i);
        }
        return "success";
    }

    /**
     * POST 添加单个桥
     * */
    @RequestMapping("/addOne")
    @ResponseBody
    String addBridge(@RequestBody(required = false) Bridge bridge){
        bridgeService.addBridge(bridge);
        return "success";
    }

    /**
     * POST 更新桥梁
     * */
    @RequestMapping("/update")
    @ResponseBody
    String updateBridge(@RequestBody(required = false) Bridge bridge){
        bridge.setBciLevel(null);
        bridge.setBsiLevel(null);
        bridge.setPuciLevel(null);
        bridgeService.updateBridgeSelective(bridge);
        System.out.println(bridge);
        return "success";
    }

    /**
     * POST 转换桥梁类型名->ID
     * */
    @RequestMapping("typeNameToId")
    @ResponseBody
    int transferNameToId(@RequestBody(required = false) Map<String,String> data){
        return bridgeService.transferTypeNameToId(data.get("bridgeTypeName"));
    }

    /**
     * POST 根据桥梁id查桥跨
     * */
    @RequestMapping("getSpans")
    @ResponseBody
    Map<String,Object> getSpansByBridgeId(@RequestBody(required = false) Map<String,Integer> data){
        int bridgeId = data.get("bridgeId");
        Map<String,Object> result = new HashMap<>();
        result.put("data",spansMapper.selectAllByBridgeId(bridgeId));
        return result;
    }

    /**
     * POST 根据桥梁id查桥墩桥台
     * */
    @RequestMapping("getPiers")
    @ResponseBody
    Map<String, Object> getPiersByBridgeId(@RequestBody(required = false) Map<String,Integer> data){
        int bridgeId = data.get("bridgeId");
        Map<String,Object> result = new HashMap<>();
        result.put("data",piersMapper.selectAllByBridgeId(bridgeId));
        return result;
    }

    /**
     * POST 获取桥梁经纬度及bridgeId
     * */

    @RequestMapping("getColAndRow")
    @ResponseBody
    List<Map<String,Object>> getPoint(){

        List<BridgeMap> resultList = bridgeMapMapper.selectAll();
        List<Map<String,Object>> result = new ArrayList<>();
        for(BridgeMap data : resultList){
            Map<String,Object> temp = new HashMap<>();
            temp.put("bridgeName",bridgeService.queryOneBridge(data.getBridgeId()).getBridgeName());
            temp.put("bridgeId",data.getBridgeId());
            temp.put("col",data.getCol());
            temp.put("row",data.getRow());
            result.add(temp);
        }

        return result;
    }
}
