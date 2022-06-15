package com.xiaojianma.carconsumptionmanager.model;

import java.math.BigDecimal;

/**
 * 充电详情
 */
public class ChargeDetails {
    /**
     * 充电起始电量
     */
    String startElectric;

    /**
     * 充电结束电量
     */
    String endElectric;

    /**
     * 充电开始时间
     */
    String startTime;

    /**
     * 充电结束时间
     */
    String endTime;

    /**
     * 充电桩品牌，如：特来电、家用充电桩、公司充电桩等
     */
    String type;

    /**
     * 充电地点
     */
    String position;

    /**
     * 充电日期
     */
    String date;

    /**
     * 是否开了发票
     */
    boolean invoice;

    public ChargeDetails(String startElectric, String endElectric, String startTime, String endTime, String type, String position, String date, boolean invoice) {
        this.startElectric = startElectric;
        this.endElectric = endElectric;
        this.startTime = startTime;
        this.endTime = endTime;
        this.type = type;
        this.position = position;
        this.date = date;
        this.invoice = invoice;
    }

    public String getStartElectric() {
        return startElectric;
    }

    public void setStartElectric(String startElectric) {
        this.startElectric = startElectric;
    }

    public String getEndElectric() {
        return endElectric;
    }

    public void setEndElectric(String endElectric) {
        this.endElectric = endElectric;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isInvoice() {
        return invoice;
    }

    public void setInvoice(boolean invoice) {
        this.invoice = invoice;
    }
}
