package org.cehn.dp.factory;

import org.cehn.dp.abstractFactory.AbstractFactory;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/11.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String type) {
        if (null == type) return null;
        switch (type.toUpperCase()) {
            case "RECTANGLE":
                return new Rectangle();
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            default:
                return () -> System.out.println("Inside Default::draw() method.");
        }
    }

}
