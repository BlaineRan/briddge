package com.ran.domain;

public class Bridge {
    /**
    * 桥梁编号
    */
    private Integer bridgeId;

    /**
    * 负责人编号
    */
    private Integer chargeId;

    /**
    * 桥梁名称
    */
    private String bridgeName;

    /**
    * 桥梁长度
    */
    private Double bridgeLength;

    /**
    * 桥梁宽度
    */
    private Double bridgeWidth;

    /**
    * 养护等级
    */
    private Integer maintainLevel;

    /**
    * 养护类别
    */
    private Integer maintainType;

    /**
    * 完好状态分级
    */
    private Integer bciLevel;

    /**
    * 结构状况分级
    */
    private Integer bsiLevel;

    /**
    * 人行地下通道状况分级
    */
    private Integer puciLevel;

    /**
    * 类型编号
    */
    private Integer bridgeTypeId;

    public Bridge() {
    }

    public Bridge(Integer bridgeId, Integer chargeId, String bridgeName, Double bridgeLength, Double bridgeWidth, Integer maintainLevel, Integer maintainType, Integer bciLevel, Integer bsiLevel, Integer puciLevel, Integer bridgeTypeId) {
        this.bridgeId = bridgeId;
        this.chargeId = chargeId;
        this.bridgeName = bridgeName;
        this.bridgeLength = bridgeLength;
        this.bridgeWidth = bridgeWidth;
        this.maintainLevel = maintainLevel;
        this.maintainType = maintainType;
        this.bciLevel = bciLevel;
        this.bsiLevel = bsiLevel;
        this.puciLevel = puciLevel;
        this.bridgeTypeId = bridgeTypeId;
    }

    public Integer getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(Integer bridgeId) {
        this.bridgeId = bridgeId;
    }

    public Integer getChargeId() {
        return chargeId;
    }

    public void setChargeId(Integer chargeId) {
        this.chargeId = chargeId;
    }

    public String getBridgeName() {
        return bridgeName;
    }

    public void setBridgeName(String bridgeName) {
        this.bridgeName = bridgeName;
    }

    public Double getBridgeLength() {
        return bridgeLength;
    }

    public void setBridgeLength(Double bridgeLength) {
        this.bridgeLength = bridgeLength;
    }

    public Double getBridgeWidth() {
        return bridgeWidth;
    }

    public void setBridgeWidth(Double bridgeWidth) {
        this.bridgeWidth = bridgeWidth;
    }

    public Integer getMaintainLevel() {
        return maintainLevel;
    }

    public void setMaintainLevel(Integer maintainLevel) {
        this.maintainLevel = maintainLevel;
    }

    public Integer getMaintainType() {
        return maintainType;
    }

    public void setMaintainType(Integer maintainType) {
        this.maintainType = maintainType;
    }

    public Integer getBciLevel() {
        return bciLevel;
    }

    public void setBciLevel(Integer bciLevel) {
        this.bciLevel = bciLevel;
    }

    public Integer getBsiLevel() {
        return bsiLevel;
    }

    public void setBsiLevel(Integer bsiLevel) {
        this.bsiLevel = bsiLevel;
    }

    public Integer getPuciLevel() {
        return puciLevel;
    }

    public void setPuciLevel(Integer puciLevel) {
        this.puciLevel = puciLevel;
    }

    public Integer getBridgeTypeId() {
        return bridgeTypeId;
    }

    public void setBridgeTypeId(Integer bridgeTypeId) {
        this.bridgeTypeId = bridgeTypeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bridgeId=").append(bridgeId);
        sb.append(", chargeId=").append(chargeId);
        sb.append(", bridgeName=").append(bridgeName);
        sb.append(", bridgeLength=").append(bridgeLength);
        sb.append(", bridgeWidth=").append(bridgeWidth);
        sb.append(", maintainLevel=").append(maintainLevel);
        sb.append(", maintainType=").append(maintainType);
        sb.append(", bciLevel=").append(bciLevel);
        sb.append(", bsiLevel=").append(bsiLevel);
        sb.append(", puciLevel=").append(puciLevel);
        sb.append(", bridgeTypeId=").append(bridgeTypeId);
        sb.append("]");
        return sb.toString();
    }
}
