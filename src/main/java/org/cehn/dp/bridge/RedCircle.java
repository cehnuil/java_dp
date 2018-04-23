package org.cehn.dp.bridge;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/23.
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println(String.format("This is RedCircle, radius:%s, x:%s, y:%s", radius, x, y));
    }
}
