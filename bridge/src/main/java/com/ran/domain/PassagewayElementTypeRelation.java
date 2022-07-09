package com.ran.domain;

public class PassagewayElementTypeRelation {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementId=").append(elementId);
        sb.append(", bridgeTypeId=").append(bridgeTypeId);
        sb.append(", weight=").append(weight);
        sb.append("]");
        return sb.toString();
    }
}