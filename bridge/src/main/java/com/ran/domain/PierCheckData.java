package com.ran.domain;

public class PierCheckData {
    /**
    * 桥墩(台)检查数据编号
    */
    private Integer pierCheckDataId;

    /**
    * 定期检查记录编号
    */
    private Integer periodicCheckId;

    /**
    * 桥墩(台)编号
    */
    private Integer pierId;

    /**
    * BCI
    */
    private Double bci;

    public Integer getPierCheckDataId() {
        return pierCheckDataId;
    }

    public void setPierCheckDataId(Integer pierCheckDataId) {
        this.pierCheckDataId = pierCheckDataId;
    }

    public Integer getPeriodicCheckId() {
        return periodicCheckId;
    }

    public void setPeriodicCheckId(Integer periodicCheckId) {
        this.periodicCheckId = periodicCheckId;
    }

    public Integer getPierId() {
        return pierId;
    }

    public void setPierId(Integer pierId) {
        this.pierId = pierId;
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
        sb.append(", pierCheckDataId=").append(pierCheckDataId);
        sb.append(", periodicCheckId=").append(periodicCheckId);
        sb.append(", pierId=").append(pierId);
        sb.append(", bci=").append(bci);
        sb.append("]");
        return sb.toString();
    }
}