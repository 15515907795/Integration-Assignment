package com.twschool.integration;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public int calculate(List<Goods> goods, List<ChargeWay> chargeWays) {
        List<Goods> normalList = new ArrayList<>();
        List<Goods> promotionList = new ArrayList<>();
        int norpoints=0;
        int protionpoints=0;

        for (Goods gd : goods) {
            if (isPromotionGoods(gd)) {
                promotionList.add(gd);
            } else {
                normalList.add(gd);
            }
        }
        for (ChargeWay chargeWay : chargeWays) {
            if (isPromotionChargeWay(chargeWay)){
                norpoints=chargeWay.calculatePoints(promotionList);

            }else {
                protionpoints=chargeWay.calculatePoints(normalList);
            }

        }
        return norpoints+protionpoints;
    }

    public boolean isPromotionGoods(Goods goods) {
        for (PromotionGoods progoods : PromotionGoods.values()) {
            if (goods.getGoodsType().toString().equals(progoods.toString())) {
                return true;
            }
        }
        return false;
    }

    public boolean isPromotionChargeWay(ChargeWay chargeWay) {
        if (chargeWay.flag() == 1) {
            return true;
        }
        return false;
    }
}
