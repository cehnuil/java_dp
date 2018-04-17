package org.cehn.dp.builder;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/13.
 */
public class PriceCounter {

    private float price = 0.0f;

    public PriceCounter addPrice(Item item) {
        this.price += item.price();
        return this;
    }

    public float getPrice() {
        return price;
    }
}
