package com.ran.controller.bridgeCheck;

public class DailyCheckRecordItem {
    /**
     * 巡检记录编号
     */
    private Integer dailyCheckId;

    /**
     * 桥梁名称
     */
    private String bridgeName;

    /**
     * 桥梁保护区域内施工
     */
    private String inProtectConstruct;

    /**
     * 其他病害
     */
    private String otherHarm;

    /**
     * 巡查人姓名
     */
    private String inspectorName;

    /**
     * 巡查日期
     */
    private String checkDate;

    /**
     * 养护建议
     */
    private String maintainAdvice;

    public DailyCheckRecordItem(Integer dailyCheckId, String bridgeName, String inProtectConstruct, String otherHarm, String inspectorName, String checkDate, String maintainAdvice) {
        this.dailyCheckId = dailyCheckId;
        this.bridgeName = bridgeName;
        this.inProtectConstruct = inProtectConstruct;
        this.otherHarm = otherHarm;
        this.inspectorName = inspectorName;
        this.checkDate = checkDate;
        this.maintainAdvice = maintainAdvice;
    }

    public DailyCheckRecordItem() {
    }

    public Integer getDailyCheckId() {
        return dailyCheckId;
    }

    public void setDailyCheckId(Integer dailyCheckId) {
        this.dailyCheckId = dailyCheckId;
    }

    public String getBridgeName() {
        return bridgeName;
    }

    public void setBridgeName(String bridgeName) {
        this.bridgeName = bridgeName;
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

    public String getInspectorName() {
        return inspectorName;
    }

    public void setInspectorName(String inspectorName) {
        this.inspectorName = inspectorName;
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
}
