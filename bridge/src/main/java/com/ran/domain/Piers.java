package com.ran.domain;

public class Piers {
    /**
    * 桥墩(台)编号
    */
    private Integer pierId;

    /**
    * 桥梁编号
    */
    private Integer bridgeId;

    /**
    * 墩(台)类型
    */
    private Integer pierType;

    public Integer getPierId() {
        return pierId;
    }

    public void setPierId(Integer pierId) {
        this.pierId = pierId;
    }

    public Integer getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(Integer bridgeId) {
        this.bridgeId = bridgeId;
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
        sb.append(", pierId=").append(pierId);
        sb.append(", bridgeId=").append(bridgeId);
        sb.append(", pierType=").append(pierType);
        sb.append("]");
        return sb.toString();
    }
}