package org.cehn.dp.prototype;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/19.
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        System.out.println("Shape : " + ShapeCache.getShape("1").getType());
        System.out.println("Shape : " + ShapeCache.getShape("2").getType());
        System.out.println("Shape : " + ShapeCache.getShape("3").getType());
    }
}
