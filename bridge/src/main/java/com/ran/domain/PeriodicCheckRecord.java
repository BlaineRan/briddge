package com.ran.domain;

public class PeriodicCheckRecord {
    /**
    * 定期检查记录编号
    */
    private Integer periodicCheckId;

    /**
    * 桥梁编号
    */
    private Integer bridgeId;

    /**
    * BCI
    */
    private Double bci;

    /**
    * BSI
    */
    private Double bsi;

    /**
    * PUCI
    */
    private Double puci;

    /**
    * 检查员编号
    */
    private Integer inspectorId;

    private String checkTime;

    public PeriodicCheckRecord() {
    }

    public PeriodicCheckRecord(Integer periodicCheckId, Integer bridgeId, Double bci, Double bsi, Double puci, Integer inspectorId, String checkTime) {
        this.periodicCheckId = periodicCheckId;
        this.bridgeId = bridgeId;
        this.bci = bci;
        this.bsi = bsi;
        this.puci = puci;
        this.inspectorId = inspectorId;
        this.checkTime = checkTime;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public Integer getPeriodicCheckId() {
        return periodicCheckId;
    }

    public void setPeriodicCheckId(Integer periodicCheckId) {
        this.periodicCheckId = periodicCheckId;
    }

    public Integer getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(Integer bridgeId) {
        this.bridgeId = bridgeId;
    }

    public Double getBci() {
        return bci;
    }

    public void setBci(Double bci) {
        this.bci = bci;
    }

    public Double getBsi() {
        return bsi;
    }

    public void setBsi(Double bsi) {
        this.bsi = bsi;
    }

    public Double getPuci() {
        return puci;
    }

    public void setPuci(Double puci) {
        this.puci = puci;
    }

    public Integer getInspectorId() {
        return inspectorId;
    }

    public void setInspectorId(Integer inspectorId) {
        this.inspectorId = inspectorId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", periodicCheckId=").append(periodicCheckId);
        sb.append(", bridgeId=").append(bridgeId);
        sb.append(", bci=").append(bci);
        sb.append(", bsi=").append(bsi);
        sb.append(", puci=").append(puci);
        sb.append(", inspectorId=").append(inspectorId);
        sb.append(", checkTime=").append(checkTime);
        sb.append("]");
        return sb.toString();
    }
}
