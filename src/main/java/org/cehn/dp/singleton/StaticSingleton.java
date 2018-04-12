package org.cehn.dp.singleton;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/12.
 */
public class StaticSingleton {

    private static class SingletonHolder {
        private static final Singleton s = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.s;
    }
}
