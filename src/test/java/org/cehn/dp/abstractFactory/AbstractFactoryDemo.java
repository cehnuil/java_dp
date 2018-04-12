package org.cehn.dp.abstractFactory;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/11.
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        AbstractFactory af = FactoryProducer.getFactory("color");
        af.getColor("red").fill();
        af.getColor("green").fill();
        af.getColor("blue").fill();
        af.getColor("random").fill();

        af = FactoryProducer.getFactory("shape");
        af.getShape("rectangle").draw();
        af.getShape("circle").draw();
        af.getShape("square").draw();
        af.getShape("random").draw();

        af = FactoryProducer.getFactory("random");
        System.out.println(af);
    }
}
