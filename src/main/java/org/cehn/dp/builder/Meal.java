package org.cehn.dp.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/13.
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    public Meal addItem(Item item) {
        items.add(item);
        return this;
    }

    public float getCost() {
        final PriceCounter pc = new PriceCounter();
        items.forEach(pc::addPrice);
        return pc.getPrice();
    }

    public void showItems() {
        items.forEach(item -> {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        });
    }
}
