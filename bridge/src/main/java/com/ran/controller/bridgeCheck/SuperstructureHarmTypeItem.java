package com.ran.controller.bridgeCheck;

public class SuperstructureHarmTypeItem {
    /**
     * 损坏类型编号
     */
    private Integer harmTypeId;

    /**
     * 评价项编号
     */
    private Integer checkItemId;

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

    private int elementId;

    public Integer getHarmTypeId() {
        return harmTypeId;
    }

    public void setHarmTypeId(Integer harmTypeId) {
        this.harmTypeId = harmTypeId;
    }

    public Integer getCheckItemId() {
        return checkItemId;
    }

    public void setCheckItemId(Integer checkItemId) {
        this.checkItemId = checkItemId;
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

    public int getElementId() {
        return elementId;
    }

    public void setElementId(int elementId) {
        this.elementId = elementId;
    }

    public SuperstructureHarmTypeItem() {
    }

    public SuperstructureHarmTypeItem(Integer harmTypeId, Integer checkItemId, String harmTypeName, String harmDef, String aStd, String bStd, String cStd, Double aDevalue, Double bDevalue, Double cDevalue, int elementId) {
        this.harmTypeId = harmTypeId;
        this.checkItemId = checkItemId;
        this.harmTypeName = harmTypeName;
        this.harmDef = harmDef;
        this.aStd = aStd;
        this.bStd = bStd;
        this.cStd = cStd;
        this.aDevalue = aDevalue;
        this.bDevalue = bDevalue;
        this.cDevalue = cDevalue;
        this.elementId = elementId;
    }
}
