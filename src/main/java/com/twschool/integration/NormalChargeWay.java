package com.twschool.integration;

import java.util.List;

public class NormalChargeWay implements ChargeWay {
    @Override
    public int calculatePoints(List<Goods> goods) {
        int points=0;
        for (Goods gd:goods){
            points+=gd.getPrice();
        }
        return points;
    }
}
