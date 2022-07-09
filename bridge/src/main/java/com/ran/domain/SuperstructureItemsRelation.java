package com.ran.domain;

public class SuperstructureItemsRelation {
    /**
    * 要素编号
    */
    private Integer elementId;

    /**
    * 评价项编号
    */
    private Integer checkItemId;

    /**
    * 桥梁分类编号
    */
    private Integer bridgeTypeId;

    public Integer getElementId() {
        return elementId;
    }

    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

    public Integer getCheckItemId() {
        return checkItemId;
    }

    public void setCheckItemId(Integer checkItemId) {
        this.checkItemId = checkItemId;
    }

    public Integer getBridgeTypeId() {
        return bridgeTypeId;
    }

    public void setBridgeTypeId(Integer bridgeTypeId) {
        this.bridgeTypeId = bridgeTypeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", elementId=").append(elementId);
        sb.append(", checkItemId=").append(checkItemId);
        sb.append(", bridgeTypeId=").append(bridgeTypeId);
        sb.append("]");
        return sb.toString();
    }
}