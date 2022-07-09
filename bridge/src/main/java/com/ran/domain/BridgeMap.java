package com.ran.domain;

public class BridgeMap {
    private Integer bridgeId;

    private Double col;

    private Double row;

    public Integer getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(Integer bridgeId) {
        this.bridgeId = bridgeId;
    }

    public Double getCol() {
        return col;
    }

    public void setCol(Double col) {
        this.col = col;
    }

    public Double getRow() {
        return row;
    }

    public void setRow(Double row) {
        this.row = row;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bridgeId=").append(bridgeId);
        sb.append(", col=").append(col);
        sb.append(", row=").append(row);
        sb.append("]");
        return sb.toString();
    }
}