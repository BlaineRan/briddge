package com.ran.controller.bridgeCheck;

public class PeriodicCheckRecordItem {
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
     * 检查员名
     */
    private String inspectorName;

    /**
     * 检查时间
     * */
    private String checkTime;

    
    public PeriodicCheckRecordItem() {
    }

    public PeriodicCheckRecordItem(Integer periodicCheckId, Integer bridgeId, Double bci, Double bsi, Double puci, String inspectorName, String checkTime) {
        this.periodicCheckId = periodicCheckId;
        this.bridgeId = bridgeId;
        this.bci = bci;
        this.bsi = bsi;
        this.puci = puci;
        this.inspectorName = inspectorName;
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

    public String getInspectorName() {
        return inspectorName;
    }

    public void setInspectorName(String inspectorName) {
        this.inspectorName = inspectorName;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }
}
