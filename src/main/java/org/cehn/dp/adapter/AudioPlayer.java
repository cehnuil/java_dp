package org.cehn.dp.adapter;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/19.
 */
public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType.toUpperCase()) {
            case "MP3":
                System.out.println("Playing mp3 file. Name: " + fileName);
                break;
            case "VLC":
            case "MP4":
                new MediaAdapter(audioType).play(audioType, fileName);
                break;
            default:
                System.out.println("Invalid media. " + audioType + " format not supported.");
        }
    }
}
