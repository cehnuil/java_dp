package org.cehn.dp.singleton;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/12.
 */
public class SingleObjectFactory {

    private volatile Singleton so;

    public Singleton getInstance() {
        Singleton lso = so;
        if (null == lso) {
            synchronized (this) {
                lso = so;
                if (null == lso) {
                    lso = so = new Singleton();
                }
            }
        }
        return lso;
    }

}
