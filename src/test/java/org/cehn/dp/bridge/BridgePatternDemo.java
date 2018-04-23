package org.cehn.dp.bridge;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/23.
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        new Circle(100, 100, 10, new RedCircle()).draw();
        new Circle(100, 100, 10, new GreenCircle()).draw();
    }
}
