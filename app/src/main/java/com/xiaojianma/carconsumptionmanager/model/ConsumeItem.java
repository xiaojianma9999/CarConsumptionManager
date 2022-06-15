package com.xiaojianma.carconsumptionmanager.model;

import java.math.BigDecimal;

/**
 * 消费对象
 */
public class ConsumeItem {

    String type;

    BigDecimal money;

    java.lang.String position;

    java.lang.String date;

    public ConsumeItem(String type, BigDecimal money, java.lang.String position, java.lang.String date) {
        this.type = type;
        this.money = money;
        this.position = position;
        this.date = date;
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
}
