package org.cehn.dp.abstractFactory;

import org.cehn.dp.factory.ShapeFactory;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/11.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String type) {
        if (null == type) return null;
        switch (type.toUpperCase()) {
            case "COLOR":
                return new ColorFactory();
            case "SHAPE":
                return new ShapeFactory();
            default:
                return null;
        }
    }
}
