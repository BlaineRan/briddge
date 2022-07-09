package com.ran.domain;

public class SpanCheckData {
    /**
    * 桥跨检查数据编号
    */
    private Integer spanCheckDataId;

    /**
    * 定期检查记录编号
    */
    private Integer periodicCheckId;

    /**
    * 桥跨编号
    */
    private Integer spanId;

    /**
    * BCI
    */
    private Double bci;

    public Integer getSpanCheckDataId() {
        return spanCheckDataId;
    }

    public void setSpanCheckDataId(Integer spanCheckDataId) {
        this.spanCheckDataId = spanCheckDataId;
    }

    public Integer getPeriodicCheckId() {
        return periodicCheckId;
    }

    public void setPeriodicCheckId(Integer periodicCheckId) {
        this.periodicCheckId = periodicCheckId;
    }

    public Integer getSpanId() {
        return spanId;
    }

    public void setSpanId(Integer spanId) {
        this.spanId = spanId;
    }

    public Double getBci() {
        return bci;
    }

    public void setBci(Double bci) {
        this.bci = bci;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spanCheckDataId=").append(spanCheckDataId);
        sb.append(", periodicCheckId=").append(periodicCheckId);
        sb.append(", spanId=").append(spanId);
        sb.append(", bci=").append(bci);
        sb.append("]");
        return sb.toString();
    }
}