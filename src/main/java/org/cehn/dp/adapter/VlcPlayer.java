package org.cehn.dp.adapter;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/19.
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("VlcPlayer play. file Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
}
