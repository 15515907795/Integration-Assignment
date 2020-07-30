package com.twschool.integration;

public class Goods {
    private int price;
    private GoodsType goodsType;

    public Goods(int price, GoodsType goodsType) {
        this.price = price;
        this.goodsType = goodsType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public GoodsType getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(GoodsType goodsType) {
        this.goodsType = goodsType;
    }
}
