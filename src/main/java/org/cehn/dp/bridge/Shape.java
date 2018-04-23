package org.cehn.dp.bridge;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/23.
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    protected abstract void draw();
}
