package com.ran.domain;

public class DailyCheckSpecific {
    /**
    * 日常巡检具体检查内容编号
    */
    private Integer specificId;

    /**
    * 巡检记录编号
    */
    private Integer dailyCheckId;

    /**
    * 检查项
    */
    private String checkItem;

    /**
    * 是否完好
    */
    private String complete;

    /**
    * 损坏类型
    */
    private String harmType;

    /**
    * 损坏程度
    */
    private String harmDegree;

    /**
    * 损坏位置
    */
    private String harmPos;

    /**
    * 备注
    */
    private String tips;

    public Integer getSpecificId() {
        return specificId;
    }

    public void setSpecificId(Integer specificId) {
        this.specificId = specificId;
    }

    public Integer getDailyCheckId() {
        return dailyCheckId;
    }

    public void setDailyCheckId(Integer dailyCheckId) {
        this.dailyCheckId = dailyCheckId;
    }

    public String getCheckItem() {
        return checkItem;
    }

    public void setCheckItem(String checkItem) {
        this.checkItem = checkItem;
    }

    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }

    public String getHarmType() {
        return harmType;
    }

    public void setHarmType(String harmType) {
        this.harmType = harmType;
    }

    public String getHarmDegree() {
        return harmDegree;
    }

    public void setHarmDegree(String harmDegree) {
        this.harmDegree = harmDegree;
    }

    public String getHarmPos() {
        return harmPos;
    }

    public void setHarmPos(String harmPos) {
        this.harmPos = harmPos;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", specificId=").append(specificId);
        sb.append(", dailyCheckId=").append(dailyCheckId);
        sb.append(", checkItem=").append(checkItem);
        sb.append(", complete=").append(complete);
        sb.append(", harmType=").append(harmType);
        sb.append(", harmDegree=").append(harmDegree);
        sb.append(", harmPos=").append(harmPos);
        sb.append(", tips=").append(tips);
        sb.append("]");
        return sb.toString();
    }

    public DailyCheckSpecific(Integer specificId, Integer dailyCheckId, String checkItem, String complete, String harmType, String harmDegree, String harmPos, String tips) {
        this.specificId = specificId;
        this.dailyCheckId = dailyCheckId;
        this.checkItem = checkItem;
        this.complete = complete;
        this.harmType = harmType;
        this.harmDegree = harmDegree;
        this.harmPos = harmPos;
        this.tips = tips;
    }

    public DailyCheckSpecific() {
    }
}
