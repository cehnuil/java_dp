package org.cehn.dp.adapter;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/19.
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        switch (audioType.toUpperCase()) {
            case "VLC":
                advancedMediaPlayer = new VlcPlayer();
                break;
            case "MP4":
                advancedMediaPlayer = new Mp4Player();
                break;
            default:
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType.toUpperCase()) {
            case "VLC":
                advancedMediaPlayer.playVlc(fileName);
                break;
            case "MP4":
                advancedMediaPlayer.playMp4(fileName);
                break;
            default:
        }
    }
}
