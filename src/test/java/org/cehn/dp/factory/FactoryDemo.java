package org.cehn.dp.factory;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/11.
 */
public class FactoryDemo {

    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        sf.getShape("circle").draw();
        sf.getShape("rectangle").draw();
        sf.getShape("square").draw();
        sf.getShape("blablabla").draw();
    }
}
