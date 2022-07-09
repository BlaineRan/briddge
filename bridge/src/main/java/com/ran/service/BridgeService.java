package com.ran.service;

import com.ran.controller.bridge.BridgeItem;
import com.ran.dao.BridgeMapper;
import com.ran.dao.BridgeTypeMapper;
import com.ran.dao.UserMapper;
import com.ran.domain.Bridge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class BridgeService {
    @Autowired
    BridgeMapper bridgeMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    BridgeTypeMapper bridgeTypeMapper;

    /**
     * 查询所有桥
     */
    public List<Bridge> queryAllBridge(){
        return bridgeMapper.selectAll();
    }

    /**
     * 查询单个桥
     */
    public Bridge queryOneBridge(int bridgeId){
        return bridgeMapper.selectByPrimaryKey(bridgeId);
    }

    /**
     * 查询桥梁总数
     * */
    public int queryBridgeNum(){
        return bridgeMapper.countAll();
    }

    /**
     * 根据页数和页大小进行分页查询
     */
    public List<Bridge> queryPageBridge(int currentPage, int pageSize, Map<String,String> queryData) {
        int rowNum = (currentPage - 1) * pageSize;
        Integer bridgeId = null;
        if(queryData.get("bridgeId") != null && queryData.get("bridgeId") != ""){
            bridgeId = Integer.parseInt(queryData.get("bridgeId"));
        }
        Integer bciLevel = null;
        if(queryData.get("bciLevel") != null && queryData.get("bciLevel") != ""){
            bciLevel = Integer.parseInt(queryData.get("bciLevel"));
        }
        Integer bsiLevel = null;
        if(queryData.get("bsiLevel") != null && queryData.get("bsiLevel") != ""){
            bsiLevel = Integer.parseInt(queryData.get("bsiLevel"));
        }
        Integer puciLevel = null;
        if(queryData.get("puciLevel") != null && queryData.get("puciLevel") != ""){
            puciLevel = Integer.parseInt(queryData.get("puciLevel"));
        }
        BridgeItem bridgeItem = new BridgeItem(bridgeId,queryData.get("bridgeName"),queryData.get("bridgeType"),null,null,queryData.get("chargeName"),null,null,bciLevel,bsiLevel,puciLevel);
        return bridgeMapper.selectAllPaging(rowNum, pageSize,bridgeItem);
    }
    /**
     * 根据条件查询记录条数
     * */
    public int queryNum(Map<String,String> queryData){
        Integer bridgeId = null;
        if(queryData.get("bridgeId") != null && queryData.get("bridgeId") != ""){
            bridgeId = Integer.parseInt(queryData.get("bridgeId"));
        }
        Integer bciLevel = null;
        if(queryData.get("bciLevel") != null && queryData.get("bciLevel") != ""){
            bciLevel = Integer.parseInt(queryData.get("bciLevel"));
        }
        Integer bsiLevel = null;
        if(queryData.get("bsiLevel") != null && queryData.get("bsiLevel") != ""){
            bsiLevel = Integer.parseInt(queryData.get("bsiLevel"));
        }
        Integer puciLevel = null;
        if(queryData.get("puciLevel") != null && queryData.get("puciLevel") != ""){
            puciLevel = Integer.parseInt(queryData.get("puciLevel"));
        }
        BridgeItem bridgeItem = new BridgeItem(bridgeId,queryData.get("bridgeName"),queryData.get("bridgeType"),null,null,queryData.get("chargeName"),null,null,bciLevel,bsiLevel,puciLevel);

        return bridgeMapper.countConditional(bridgeItem);
    }

    /**
     * 将桥数据转化为前端可视数据
     */
    public BridgeItem transferBridgeData(Bridge bridge) {
        String chargeName = userMapper.selectByPrimaryKey(bridge.getChargeId()).getUserName();
        String bridgeTypeName = bridgeTypeMapper.selectByPrimaryKey(bridge.getBridgeTypeId()).getBridgeTypeName();

        BridgeItem bridgeItem = new BridgeItem(bridge.getBridgeId(), bridge.getBridgeName(), bridgeTypeName, bridge.getBridgeLength(), bridge.getBridgeWidth(), chargeName, bridge.getMaintainType(), bridge.getMaintainLevel(), bridge.getBciLevel(), bridge.getBsiLevel(), bridge.getPuciLevel());

        return bridgeItem;
    }

    /**
     * 根据id删除桥梁
     * */
    @Transactional
    public int deleteBridge(Integer bridgeId){
        return bridgeMapper.deleteByPrimaryKey(bridgeId);
    }

    /**
     * 添加桥梁 自动获取新id
     * */
    public int addBridge(Bridge bridge){
        int newId = bridgeMapper.selectMaxPrimaryKey();
        bridge.setBridgeId(newId);
        return bridgeMapper.insert(bridge);
    }

    /**
     * 更新桥梁 忽视null属性
     * */
    public int updateBridgeSelective(Bridge bridge){
        return bridgeMapper.updateByPrimaryKeySelective(bridge);
    }

    /**
     * 转换桥梁类型名至id
     * */
    public int transferTypeNameToId(String bridgeTypeName){
        return bridgeTypeMapper.selectBridgeTypeIdByName(bridgeTypeName);
    }

}
