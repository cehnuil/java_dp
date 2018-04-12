package org.cehn.dp.factory;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/11.
 */
public class SwitchNull {

    public static void main(String[] args) {
        String a = null;
        switch (a) {
            case "1":
                System.out.println("1");
                break;
            default:
                    System.out.println("default");
        }
    }
}
