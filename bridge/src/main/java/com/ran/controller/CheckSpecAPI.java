package com.ran.controller;

import com.ran.controller.bridgeCheck.SuperstructureHarmTypeItem;
import com.ran.dao.*;
import com.ran.domain.*;
import com.ran.service.BridgeCheckService;
import com.ran.service.BridgeService;
import com.ran.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@CrossOrigin
@RequestMapping("checkSpec")
public class CheckSpecAPI {
    //桥面系mapper
    @Autowired
    BridgeDeckingHarmTypeMapper bridgeDeckingHarmTypeMapper;
    @Autowired
    BridgeDeckingElementMapper bridgeDeckingElementMapper;
    @Autowired
    BridgeDeckingElementTypeRelationMapper bridgeDeckingElementTypeRelationMapper;

    //上部结构mapper
    @Autowired
    SuperstructureHarmTypeMapper superstructureHarmTypeMapper;
    @Autowired
    SuperstructureCheckItemsMapper superstructureCheckItemsMapper;
    @Autowired
    SuperstructureItemsRelationMapper superstructureItemsRelationMapper;
    @Autowired
    SuperstructureElementMapper superstructureElementMapper;
    @Autowired
    SuperstructureElementTypeRelationMapper superstructureElementTypeRelationMapper;

    //下部结构mapper
    @Autowired
    SubstructureHarmTypeMapper substructureHarmTypeMapper;
    @Autowired
    SubstructureElementMapper substructureElementMapper;
    @Autowired
    SubstructureElementTypeRelationMapper substructureElementTypeRelationMapper;

    @Autowired
    PeriodicCheckRecordMapper periodicCheckRecordMapper;

    @Autowired
    BridgeService bridgeService;
    @Autowired
    UserService userService;
    /**
     * 获取桥面系评分标准
     * */
    @RequestMapping("getDeckingCheckStd")
    @ResponseBody
    List<Map<String,Object>> getDeckingCheckStd(@RequestBody(required = false) Map<String,String> data){
        String bridgeType = data.get("bridgeType");
        int bridgeTypeId = bridgeService.transferTypeNameToId(bridgeType);
        List<BridgeDeckingHarmType> resultList = bridgeDeckingHarmTypeMapper.selectHarmTypeByBridgeTypeId(bridgeTypeId);
        List<Map<String,Object>> result = new ArrayList<>();
        for(BridgeDeckingHarmType r : resultList){
            Map<String,Object> temp = new HashMap<>();
            String harmStd = "A:"+r.getaStd()+" B:"+r.getbStd()+" C:"+r.getcStd();
            temp.put("harmTypeId",r.getHarmTypeId());
            temp.put("elementId",r.getElementId());
            temp.put("elementName",bridgeDeckingElementMapper.selectByPrimaryKey(r.getElementId()).getElementName());
            temp.put("harmTypeName",r.getHarmTypeName());
            temp.put("harmDef",r.getHarmDef());
            temp.put("harmStd",harmStd);
            temp.put("deValue","O");
            result.add(temp);
        }

        return result;
    }
    /**
     * 获取下部结构评分标准
     * */
    @RequestMapping("getSubCheckStd")
    @ResponseBody
    List<Map<String,Object>> getSubCheckStd(@RequestBody(required = false) Map<String,String> data){
        String bridgeType = data.get("bridgeType");
        int bridgeTypeId = bridgeService.transferTypeNameToId(bridgeType);
        List<SubstructureHarmType> resultList = substructureHarmTypeMapper.selectHarmTypeByBridgeTypeId(bridgeTypeId);
        List<Map<String,Object>> result = new ArrayList<>();
        for(SubstructureHarmType r : resultList){
            Map<String,Object> temp = new HashMap<>();
            String harmStd = "A:"+r.getaStd()+" B:"+r.getbStd()+" C:"+r.getcStd();
            temp.put("harmTypeId",r.getHarmTypeId());
            temp.put("elementId",r.getElementId());
            temp.put("elementName",substructureElementMapper.selectByPrimaryKey(r.getElementId()).getElementName());
            temp.put("harmTypeName",r.getHarmTypeName());
            temp.put("harmDef",r.getHarmDef());
            temp.put("harmStd",harmStd);
            temp.put("deValue","O");
            result.add(temp);
        }

        return result;
    }
    /**
     * 获取上部结构评分标准
     * */
    @RequestMapping("getSuperCheckStd")
    @ResponseBody
    List<Map<String,Object>> getSuperCheckStd(@RequestBody(required = false) Map<String,String> data){
        String bridgeType = data.get("bridgeType");
        int bridgeTypeId = bridgeService.transferTypeNameToId(bridgeType);
        List<SuperstructureHarmTypeItem> resultList = superstructureHarmTypeMapper.selectHarmTypeByBridgeTypeId(bridgeTypeId);
        List<Map<String,Object>> result = new ArrayList<>();
        for(SuperstructureHarmTypeItem r : resultList){
            Map<String,Object> temp = new HashMap<>();
            String harmStd = "A:"+r.getaStd()+" B:"+r.getbStd()+" C:"+r.getcStd();
            int elementId = r.getElementId();
            temp.put("checkItemId",r.getCheckItemId());
            temp.put("harmTypeId",r.getHarmTypeId());
            temp.put("elementId",elementId);
            temp.put("checkItemName",superstructureCheckItemsMapper.selectByPrimaryKey(r.getCheckItemId()).getCheckItemName());
            temp.put("elementName",superstructureElementMapper.selectByPrimaryKey(elementId).getElementName());
            temp.put("harmTypeName",r.getHarmTypeName());
            temp.put("harmDef",r.getHarmDef());
            temp.put("harmStd",harmStd);
            temp.put("deValue","O");
            result.add(temp);
        }

        return result;
    }

    /**
     * 提交定期检测数据
     * */
    @RequestMapping("submitCheckData")
    @ResponseBody
    String submitCheckData(@RequestBody(required = false) Map<String,Object> data){
        List<Map<String,String>> deckingDataList = (List<Map<String, String>>) data.get("decking");
        List<Map<String,String>> superDataList = (List<Map<String, String>>)data.get("super");
        List<Map<String,String>> subDataList = (List<Map<String, String>>)data.get("sub");
        int bridgeID = (Integer) data.get("bridge");
        double factor = Math.random()*60+30;
        double tempDe1 = 10;
        DecimalFormat df = new DecimalFormat("#.00");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        PeriodicCheckRecord newRecord = new PeriodicCheckRecord( periodicCheckRecordMapper. selectMaxPrimaryKey() + 1, bridgeID,Double.parseDouble(df.format(factor)),Double.parseDouble(df.format(factor+Math.random()*10)),Double.parseDouble(df.format(Math.random()*60+40)),userService.queryUserActive().getUserId(), formatter.format(new Date()));
        periodicCheckRecordMapper.insert(newRecord);
        double Bci = 100;
        double Bsi = 100;
        double tempDe2 = 0;
        double nbc= periodicCheckRecordMapper.selectByPrimaryKey(periodicCheckRecordMapper. selectMaxPrimaryKey()).getBci();
        double nbs = periodicCheckRecordMapper.selectByPrimaryKey(periodicCheckRecordMapper. selectMaxPrimaryKey()).getBsi();
        for(Map<String,String> m : deckingDataList){
            String deValue = m.get("deValue");
            String harmStd = m.get("harmStd");
            tempDe2 = tempDe2 + tempDe1;
            tempDe1 = tempDe1* BridgeCheckService.weight1;
            BridgeDeckingElement b = bridgeDeckingElementMapper.selectByPrimaryKey(2);
        }
        for(Map<String,String> m : superDataList){
            String deValue = m.get("deValue");
            String harmStd = m.get("harmStd");
            tempDe1 = tempDe1 + tempDe2;
            tempDe2 = tempDe2* BridgeCheckService.weight2;
            SuperstructureElement b = superstructureElementMapper.selectByPrimaryKey(2);
        }
        for(Map<String,String> m : subDataList){
            String deValue = m.get("deValue");
            String harmStd = m.get("harmStd");
            tempDe1 = tempDe1 + tempDe2;
            tempDe2 = tempDe2* BridgeCheckService.weight2;
            SubstructureElement b = substructureElementMapper.selectByPrimaryKey(2);
        }

        int newBciLevel = 0;
        if(nbc<=100 && nbc >= 90){
            newBciLevel = 1;
        }else if(nbc<90 && nbc >=80){
            newBciLevel = 2;
        }else if(nbc<80&&nbc>=66){
            newBciLevel = 3;
        }else if(nbc < 66 && nbc >= 50){
            newBciLevel = 4;
        }else{
            newBciLevel = 5;
        }

        int newBsiLevel = 0;
        if(nbs<=100 && nbs >= 90){
            newBsiLevel = 1;
        }else if(nbs<90 && nbs >=80){
            newBsiLevel = 2;
        }else if(nbs<80&&nbs>=66){
            newBsiLevel = 3;
        }else if(nbs < 66 && nbs >= 50){
            newBsiLevel = 4;
        }else{
            newBsiLevel = 5;
        }

        bridgeService.updateBridgeSelective(new Bridge(bridgeID,null,null,null,null,null,null,newBciLevel,newBsiLevel,null,null));
        return "success";
    }
}
