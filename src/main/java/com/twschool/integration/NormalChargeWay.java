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
        int totalPrice = 0;
        for (Goods gd : goods) {
            if (totalPrice+gd.getPrice()>1000&&totalPrice<=1000) {
                points =1000+ (gd.getPrice()-1000)/20;
            }
            else if (totalPrice>1000){
                points+=gd.getPrice()/20;
            }
            else {
                points += gd.getPrice();
            }
            totalPrice+=gd.getPrice();
        }
        return points;
    }

    @Override
    public int flag() {
        return 0;
    }
}
