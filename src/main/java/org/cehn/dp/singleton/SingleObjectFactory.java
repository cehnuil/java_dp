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

    /**
     * DCL(Double Check Lock)作用
     * 1.懒加载
     * 2.减小锁粒度
     *
     * 本地变量作用  提升性能
     * @return
     */
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
