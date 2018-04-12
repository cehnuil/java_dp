package org.cehn.dp.abstractFactory;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/11.
 */
public class ColorFactory extends AbstractFactory {

    public Color getColor(String type) {
        if (null == type) return null;
        switch (type.toUpperCase()) {
            case "RED":
                return new Red();
            case "GREEN":
                return new Green();
            case "BLUE":
                return new Blue();
            default:
                return () -> System.out.println("Inside Default::fill() methods.");
        }
    }

}
