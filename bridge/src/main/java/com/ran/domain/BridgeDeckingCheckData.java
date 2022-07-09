package com.ran.domain;

public class BridgeDeckingCheckData {
    /**
    * 检查数据编号
    */
    private Integer checkDataId;

    /**
    * 定期检查记录编号
    */
    private Integer periodicCheckId;

    /**
    * 评估要素名
    */
    private String elementName;

    /**
    * 扣分值
    */
    private Double deValue;

    public Integer getCheckDataId() {
        return checkDataId;
    }

    public void setCheckDataId(Integer checkDataId) {
        this.checkDataId = checkDataId;
    }

    public Integer getPeriodicCheckId() {
        return periodicCheckId;
    }

    public void setPeriodicCheckId(Integer periodicCheckId) {
        this.periodicCheckId = periodicCheckId;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public Double getDeValue() {
        return deValue;
    }

    public void setDeValue(Double deValue) {
        this.deValue = deValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", checkDataId=").append(checkDataId);
        sb.append(", periodicCheckId=").append(periodicCheckId);
        sb.append(", elementName=").append(elementName);
        sb.append(", deValue=").append(deValue);
        sb.append("]");
        return sb.toString();
    }
}