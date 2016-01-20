package com.main.designPattern.AdapterPattern;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String filename) {

	MediaAdapter adapter = new MediaAdapter(audioType);
	if (audioType.equals("MP3")) {
	    System.out.println("Playing MP3 :" + filename);
	}

	if (audioType.equals("FLV") || audioType.equals("VLC")) {
	    adapter.play(audioType, filename);
	}
    }

}
