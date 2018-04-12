package org.cehn.dp.singleton;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/12.
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingleObjectFactory so = new SingleObjectFactory();
        so.getInstance().showMessage();
        so.getInstance().showMessage();
        so.getInstance().showMessage();
        so.getInstance().showMessage();
        so.getInstance().showMessage();


        System.out.println("============static========");
        StaticSingleton.getInstance().showMessage();
        StaticSingleton.getInstance().showMessage();
        StaticSingleton.getInstance().showMessage();
        StaticSingleton.getInstance().showMessage();
        StaticSingleton.getInstance().showMessage();
        StaticSingleton.getInstance().showMessage();
    }
}
