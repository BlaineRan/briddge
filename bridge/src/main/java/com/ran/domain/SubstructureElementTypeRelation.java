package com.ran.domain;

public class SubstructureElementTypeRelation {
    /**
    * 要素编号
    */
    private Integer elementId;

    /**
    * 类型编号
    */
    private Integer bridgeTypeId;

    /**
    * 权重
    */
    private Double weight;

    /**
    * 墩(台)类型
    */
    private Integer pierType;

    public Integer getElementId() {
        return elementId;
    }

    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

    public Integer getBridgeTypeId() {
        return bridgeTypeId;
    }

    public void setBridgeTypeId(Integer bridgeTypeId) {
        this.bridgeTypeId = bridgeTypeId;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getPierType() {
        return pierType;
    }

    public void setPierType(Integer pierType) {
        this.pierType = pierType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementId=").append(elementId);
        sb.append(", bridgeTypeId=").append(bridgeTypeId);
        sb.append(", weight=").append(weight);
        sb.append(", pierType=").append(pierType);
        sb.append("]");
        return sb.toString();
    }
}