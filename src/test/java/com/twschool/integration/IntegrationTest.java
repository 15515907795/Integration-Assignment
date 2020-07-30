package com.twschool.integration;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class IntegrationTest {
    @Test
    public void should_return_110points_when_buy_nomal_goods_price_110() {
        List<Goods> goodsList = new ArrayList<>();
        List<ChargeWay> chargeWayList = new ArrayList<>();
        Goods basketball = new Goods(50, NomalGoods.BASKETBALL);
        Goods football = new Goods(60, NomalGoods.FOOTBALL);
        goodsList.add(basketball);
        goodsList.add(football);
        Calculator cal = new Calculator();
        ChargeWay chargeWay = new NormalChargeWay();
        chargeWayList.add(chargeWay);
        int points = cal.calculate(goodsList, chargeWayList);
        assertEquals(110, points);
    }

    @Test
    public void should_return_100points_when_buy_watermelon_and_apple_and_shampoo() {
        List<Goods> goodsList = new ArrayList<>();
        List<ChargeWay> chargeWayList = new ArrayList<>();
        Goods apple = new Goods(10, PromotionGoods.APPLE);
        Goods watermelon = new Goods(30, PromotionGoods.WATERMELON);
        Goods shampoo = new Goods(20, NomalGoods.SHAMPOO);
        goodsList.add(apple);
        goodsList.add(watermelon);
        goodsList.add(shampoo);
        Calculator cal = new Calculator();
        ChargeWay norchargeWay = new NormalChargeWay();
        ChargeWay prochargeWay = new PromotionChargeWay();

        chargeWayList.add(norchargeWay);
        chargeWayList.add(prochargeWay);

        int points = cal.calculate(goodsList, chargeWayList);
        assertEquals(100, points);
    }
    @Test
    public void should_return_1067points_when_buy_normal_fridge_which_price_2350() {
        List<Goods> goodsList = new ArrayList<>();
        List<ChargeWay> chargeWayList = new ArrayList<>();
        Goods fridge = new Goods(2350, NomalGoods.FRIDGE);
        goodsList.add(fridge);
        Calculator cal = new Calculator();
        ChargeWay chargeWay = new NormalChargeWay();
        chargeWayList.add(chargeWay);
        int points = cal.calculate(goodsList, chargeWayList);
        assertEquals(1067, points);
    }

    @Test
    public void should_return_3000points_when_buy_promotion_TV_which_price_2000() {
        List<Goods> goodsList = new ArrayList<>();
        List<ChargeWay> chargeWayList = new ArrayList<>();
        Goods television = new Goods(2000, PromotionGoods.TELEVISION);
        goodsList.add(television);
        Calculator cal = new Calculator();
        ChargeWay chargeWay = new PromotionChargeWay();
        chargeWayList.add(chargeWay);
        int points = cal.calculate(goodsList, chargeWayList);
        assertEquals(3000, points);
    }
}
