package com.ran.domain;

public class BridgeDeckingElement {
    /**
    * 要素编号
    */
    private Integer elementId;

    /**
    * 要素名称
    */
    private String elementName;

    public Integer getElementId() {
        return elementId;
    }

    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementId=").append(elementId);
        sb.append(", elementName=").append(elementName);
        sb.append("]");
        return sb.toString();
    }
}