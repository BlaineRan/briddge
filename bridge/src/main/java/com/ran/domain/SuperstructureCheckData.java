package com.ran.domain;

public class SuperstructureCheckData {
    private Integer checkDataId;

    private Integer spanCheckDataId;

    private String elementName;

    private Double deValue;

    public Integer getCheckDataId() {
        return checkDataId;
    }

    public void setCheckDataId(Integer checkDataId) {
        this.checkDataId = checkDataId;
    }

    public Integer getSpanCheckDataId() {
        return spanCheckDataId;
    }

    public void setSpanCheckDataId(Integer spanCheckDataId) {
        this.spanCheckDataId = spanCheckDataId;
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
        sb.append(", spanCheckDataId=").append(spanCheckDataId);
        sb.append(", elementName=").append(elementName);
        sb.append(", deValue=").append(deValue);
        sb.append("]");
        return sb.toString();
    }
}