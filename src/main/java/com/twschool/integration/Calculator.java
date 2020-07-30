package com.twschool.integration;

import java.util.List;

public class Calculator {
    public int calculate(List<Goods> goods,ChargeWay chargeWay){
        return chargeWay.calculatePoints(goods);
    }
}
