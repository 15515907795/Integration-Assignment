package com.twschool.integration;

import java.util.List;

public class NormalChargeWay implements ChargeWay {
    int flag = 0;

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

            points += gd.getPrice();
        }
        return points;
    }

    @Override
    public int flag() {
        return 0;
    }
}
