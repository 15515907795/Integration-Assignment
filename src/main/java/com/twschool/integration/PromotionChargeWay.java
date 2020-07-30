package com.twschool.integration;

import java.util.List;

public class PromotionChargeWay implements ChargeWay {
    int flag = 1;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public int calculatePoints(List<Goods> goods) {
        int points = 0;
        for (Goods gd : goods) {
            points += gd.getPrice() * 2;
        }
        return points;
    }

    @Override
    public int flag() {
        return 1;
    }
}
