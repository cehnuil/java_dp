package org.cehn.dp.builder;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/13.
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        return new Meal()
                .addItem(new VegBurger())
                .addItem(new Coke());
    }

    public Meal prepareNonVegMeal() {
        return new Meal()
                .addItem(new ChickenBurger())
                .addItem(new Pepsi());
    }
}
