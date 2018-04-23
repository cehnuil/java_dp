package org.cehn.dp.bridge;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/23.
 */
public class Circle extends Shape {

    private int x,y,radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    @Override
    protected void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
