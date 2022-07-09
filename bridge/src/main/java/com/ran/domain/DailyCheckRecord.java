package com.ran.domain;

public class DailyCheckRecord {
    /**
    * 巡检记录编号
    */
    private Integer dailyCheckId;

    /**
    * 桥梁编号
    */
    private Integer bridgeId;

    /**
    * 桥梁保护区域内施工
    */
    private String inProtectConstruct;

    /**
    * 其他病害
    */
    private String otherHarm;

    /**
    * 巡查人编号
    */
    private Integer inspectorId;

    /**
    * 巡查日期
    */
    private String checkDate;

    /**
    * 养护建议
    */
    private String maintainAdvice;

    public Integer getDailyCheckId() {
        return dailyCheckId;
    }

    public void setDailyCheckId(Integer dailyCheckId) {
        this.dailyCheckId = dailyCheckId;
    }

    public Integer getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(Integer bridgeId) {
        this.bridgeId = bridgeId;
    }

    public String getInProtectConstruct() {
        return inProtectConstruct;
    }

    public void setInProtectConstruct(String inProtectConstruct) {
        this.inProtectConstruct = inProtectConstruct;
    }

    public String getOtherHarm() {
        return otherHarm;
    }

    public void setOtherHarm(String otherHarm) {
        this.otherHarm = otherHarm;
    }

    public Integer getInspectorId() {
        return inspectorId;
    }

    public void setInspectorId(Integer inspectorId) {
        this.inspectorId = inspectorId;
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate;
    }

    public String getMaintainAdvice() {
        return maintainAdvice;
    }

    public void setMaintainAdvice(String maintainAdvice) {
        this.maintainAdvice = maintainAdvice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dailyCheckId=").append(dailyCheckId);
        sb.append(", bridgeId=").append(bridgeId);
        sb.append(", inProtectConstruct=").append(inProtectConstruct);
        sb.append(", otherHarm=").append(otherHarm);
        sb.append(", inspectorId=").append(inspectorId);
        sb.append(", checkDate=").append(checkDate);
        sb.append(", maintainAdvice=").append(maintainAdvice);
        sb.append("]");
        return sb.toString();
    }

    public DailyCheckRecord(Integer dailyCheckId, Integer bridgeId, String inProtectConstruct, String otherHarm, Integer inspectorId, String checkDate, String maintainAdvice) {
        this.dailyCheckId = dailyCheckId;
        this.bridgeId = bridgeId;
        this.inProtectConstruct = inProtectConstruct;
        this.otherHarm = otherHarm;
        this.inspectorId = inspectorId;
        this.checkDate = checkDate;
        this.maintainAdvice = maintainAdvice;
    }
}
