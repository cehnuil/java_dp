package org.cehn.dp.prototype;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/19.
 */
public abstract class Shape implements Cloneable {

    private String id;

    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public Shape setId(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public Shape setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    protected Shape clone() {
        Shape clone = null;

        try {
            clone = (Shape) super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
