package com.ran.domain;

public class BridgeType {
    /**
    * 类型编号
    */
    private Integer bridgeTypeId;

    /**
    * 类型名称
    */
    private String bridgeTypeName;

    public Integer getBridgeTypeId() {
        return bridgeTypeId;
    }

    public void setBridgeTypeId(Integer bridgeTypeId) {
        this.bridgeTypeId = bridgeTypeId;
    }

    public String getBridgeTypeName() {
        return bridgeTypeName;
    }

    public void setBridgeTypeName(String bridgeTypeName) {
        this.bridgeTypeName = bridgeTypeName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bridgeTypeId=").append(bridgeTypeId);
        sb.append(", bridgeTypeName=").append(bridgeTypeName);
        sb.append("]");
        return sb.toString();
    }
}