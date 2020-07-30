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
    public void should_return_110points_when_given_nomal_goods_price_110() {
        //given
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
    public void should_return_100points_when_given_watermelon_and_apple_and_shampoo() {
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
}
