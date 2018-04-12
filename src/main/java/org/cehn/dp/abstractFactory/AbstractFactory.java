package org.cehn.dp.abstractFactory;

import org.cehn.dp.factory.Shape;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/11.
 */
public abstract class AbstractFactory {

    // 异包时 overriden方法需要是public的
    // http://www.codejava.net/java-core/the-java-language/12-rules-of-overriding-in-java-you-should-know
    public Shape getShape(String type) { return null; }

    public Color getColor(String type) { return null; }

}
