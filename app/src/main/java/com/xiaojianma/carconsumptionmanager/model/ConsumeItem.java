package com.xiaojianma.carconsumptionmanager.model;

import java.math.BigDecimal;

/**
 * 消费对象
 */
public class ConsumeItem {

    String type;

    BigDecimal money;

    String position;

    String date;

    /**
     * 是否开了发票
     */
    boolean invoice;

    public ConsumeItem(String type, BigDecimal money, String position, String date, boolean invoice) {
        this.type = type;
        this.money = money;
        this.position = position;
        this.date = date;
        this.invoice = invoice;
    }

    public String getType() {
        return type;
    }

    public ConsumeItem setType(String type) {
        this.type = type;
        return this;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public ConsumeItem setMoney(BigDecimal money) {
        this.money = money;
        return this;
    }

    public java.lang.String getPosition() {
        return position;
    }

    public ConsumeItem setPosition(java.lang.String position) {
        this.position = position;
        return this;
    }

    public java.lang.String getDate() {
        return date;
    }

    public ConsumeItem setDate(java.lang.String date) {
        this.date = date;
        return this;
    }

    public boolean isInvoice() {
        return invoice;
    }

    public void setInvoice(boolean invoice) {
        this.invoice = invoice;
    }
}
