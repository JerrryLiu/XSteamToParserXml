package com.sky.xsteamtoparserxml;

/**
 * Created by JerryLiu on 2016/7/19.
 */
public class Result {

    private String version;
    private int upgradeMode;
    private Packages packages;

    public int getUpgradeMode() {
        return upgradeMode;
    }

    public void setUpgradeMode(int upgradeMode) {
        this.upgradeMode = upgradeMode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Packages getPackages() {
        return packages;
    }

    public void setPackages(Packages packages) {
        this.packages = packages;
    }
}
