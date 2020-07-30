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
        List<Goods> goodsList = new ArrayList<Goods>();
        Goods basketball = new Goods(50, NomalGoods.BASKETBALL);
        Goods football = new Goods(60, NomalGoods.FOOTBALL);
        goodsList.add(basketball);
        goodsList.add(football);
        Calculator cal = new Calculator();
        ChargeWay chargeWay=new NormalChargeWay();
        int points=cal.calculate(goodsList,chargeWay);
        assertEquals(110,points);
    }
}
