package com.ran.domain;

public class SuperstructureCheckItems {
    /**
    * 评价项编号
    */
    private Integer checkItemId;

    /**
    * 评价项名称
    */
    private String checkItemName;

    public Integer getCheckItemId() {
        return checkItemId;
    }

    public void setCheckItemId(Integer checkItemId) {
        this.checkItemId = checkItemId;
    }

    public String getCheckItemName() {
        return checkItemName;
    }

    public void setCheckItemName(String checkItemName) {
        this.checkItemName = checkItemName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", checkItemId=").append(checkItemId);
        sb.append(", checkItemName=").append(checkItemName);
        sb.append("]");
        return sb.toString();
    }
}