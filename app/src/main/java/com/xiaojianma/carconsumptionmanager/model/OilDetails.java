package com.xiaojianma.carconsumptionmanager.model;

        import java.math.BigDecimal;

/**
 * 加油详情
 */
public class OilDetails {
    /**
     * 油品类型，如：92#汽油、95#汽油、98#汽油、0#柴油
     */
    String type;

    /**
     * 消费总金额
     */
    BigDecimal consumeMoney;

    /**
     * 单价，多少钱每升
     */
    BigDecimal price;

    /**
     * 加了多少升
     */
    BigDecimal litre;

    /**
     * 加油地点
     */
    String position;

    /**
     * 加油日期
     */
    String date;

    /**
     * 是否开了发票
     */
    boolean invoice;

    public OilDetails(String type, BigDecimal consumeMoney, BigDecimal price, BigDecimal litre, String position, String date, boolean invoice) {
        this.type = type;
        this.consumeMoney = consumeMoney;
        this.price = price;
        this.litre = litre;
        this.position = position;
        this.date = date;
        this.invoice = invoice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getConsumeMoney() {
        return consumeMoney;
    }

    public void setConsumeMoney(BigDecimal consumeMoney) {
        this.consumeMoney = consumeMoney;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getLitre() {
        return litre;
    }

    public void setLitre(BigDecimal litre) {
        this.litre = litre;
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
