package com.ran.domain;

public class SubstructureCheckData {
    /**
    * 检查记录编号
    */
    private Integer checkDataId;

    /**
    * 桥墩(台)检查数据编号
    */
    private Integer pierCheckDataId;

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

    public Integer getPierCheckDataId() {
        return pierCheckDataId;
    }

    public void setPierCheckDataId(Integer pierCheckDataId) {
        this.pierCheckDataId = pierCheckDataId;
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
        sb.append(", pierCheckDataId=").append(pierCheckDataId);
        sb.append(", elementName=").append(elementName);
        sb.append(", deValue=").append(deValue);
        sb.append("]");
        return sb.toString();
    }
}