package com.ran.controller.bridge;

public class BridgeItem {
    public Integer bridgeId;
    public String bridgeName;
    public String bridgeType;
    public Double bridgeLength;

    public Double bridgeWidth;
    public String chargeName;
    public Integer maintainType;
    public Integer maintainLevel;
    public Integer bciLevel;
    public Integer bsiLevel;
    public Integer puciLevel;


    public BridgeItem(Integer bridgeId, String bridgeName, String bridgeType, Double bridgeLength, Double bridgeWidth, String chargeName, Integer maintainType, Integer maintainLevel, Integer bciLevel, Integer bsiLevel, Integer puciLevel) {
        this.bridgeId = bridgeId;
        this.bridgeName = bridgeName;
        this.bridgeType = bridgeType;
        this.bridgeLength = bridgeLength;
        this.bridgeWidth = bridgeWidth;
        this.chargeName = chargeName;
        this.maintainType = maintainType;
        this.maintainLevel = maintainLevel;
        this.bciLevel = bciLevel;
        this.bsiLevel = bsiLevel;
        this.puciLevel = puciLevel;
    }

    public BridgeItem() {
    }
}
