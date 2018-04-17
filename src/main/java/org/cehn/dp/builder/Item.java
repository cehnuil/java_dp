package org.cehn.dp.builder;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/13.
 */
public interface Item {
    String name();

    Packing packing();

    float price();
}
