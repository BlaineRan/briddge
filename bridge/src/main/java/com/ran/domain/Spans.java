package com.ran.domain;

public class Spans {
    /**
    * 桥跨编号
    */
    private Integer spanId;

    /**
    * 桥梁编号
    */
    private Integer bridgeId;

    public Integer getSpanId() {
        return spanId;
    }

    public void setSpanId(Integer spanId) {
        this.spanId = spanId;
    }

    public Integer getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(Integer bridgeId) {
        this.bridgeId = bridgeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spanId=").append(spanId);
        sb.append(", bridgeId=").append(bridgeId);
        sb.append("]");
        return sb.toString();
    }
}