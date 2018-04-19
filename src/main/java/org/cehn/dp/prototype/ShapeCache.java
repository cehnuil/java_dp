package org.cehn.dp.prototype;

import java.util.Hashtable;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/19.
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return cachedShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape)
    public static void loadCache() {
        shapeMap.put("1", new Circle().setId("1"));
        shapeMap.put("2", new Square().setId("1"));
        shapeMap.put("3", new Rectangle().setId("1"));

    }
}
