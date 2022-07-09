package com.ran.domain;

public class SubstructureHarmType {
    /**
    * 损坏类型编号
    */
    private Integer harmTypeId;

    /**
    * 要素编号
    */
    private Integer elementId;

    private String harmTypeName;

    /**
    * 定义
    */
    private String harmDef;

    /**
    * 评价A标准
    */
    private String aStd;

    /**
    * 评价B标准
    */
    private String bStd;

    /**
    * 评价C标准
    */
    private String cStd;

    /**
    * 评价A扣分
    */
    private Double aDevalue;

    /**
    * 评价B扣分
    */
    private Double bDevalue;

    /**
    * 评价C扣分
    */
    private Double cDevalue;

    public Integer getHarmTypeId() {
        return harmTypeId;
    }

    public void setHarmTypeId(Integer harmTypeId) {
        this.harmTypeId = harmTypeId;
    }

    public Integer getElementId() {
        return elementId;
    }

    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

    public String getHarmTypeName() {
        return harmTypeName;
    }

    public void setHarmTypeName(String harmTypeName) {
        this.harmTypeName = harmTypeName;
    }

    public String getHarmDef() {
        return harmDef;
    }

    public void setHarmDef(String harmDef) {
        this.harmDef = harmDef;
    }

    public String getaStd() {
        return aStd;
    }

    public void setaStd(String aStd) {
        this.aStd = aStd;
    }

    public String getbStd() {
        return bStd;
    }

    public void setbStd(String bStd) {
        this.bStd = bStd;
    }

    public String getcStd() {
        return cStd;
    }

    public void setcStd(String cStd) {
        this.cStd = cStd;
    }

    public Double getaDevalue() {
        return aDevalue;
    }

    public void setaDevalue(Double aDevalue) {
        this.aDevalue = aDevalue;
    }

    public Double getbDevalue() {
        return bDevalue;
    }

    public void setbDevalue(Double bDevalue) {
        this.bDevalue = bDevalue;
    }

    public Double getcDevalue() {
        return cDevalue;
    }

    public void setcDevalue(Double cDevalue) {
        this.cDevalue = cDevalue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", harmTypeId=").append(harmTypeId);
        sb.append(", elementId=").append(elementId);
        sb.append(", harmTypeName=").append(harmTypeName);
        sb.append(", harmDef=").append(harmDef);
        sb.append(", aStd=").append(aStd);
        sb.append(", bStd=").append(bStd);
        sb.append(", cStd=").append(cStd);
        sb.append(", aDevalue=").append(aDevalue);
        sb.append(", bDevalue=").append(bDevalue);
        sb.append(", cDevalue=").append(cDevalue);
        sb.append("]");
        return sb.toString();
    }
}