package com.main.designPattern.AdapterPattern;

public class MediaAdapter implements MediaPlayer {

    AdvancePlayer advnPlayer;

    public MediaAdapter(String audioType) {
	if (audioType.equals("FLV")) {
	    advnPlayer = new FlvPlayer();
	}
	if (audioType.equals("VLC")) {
	    advnPlayer = new VlcPlayer();
	}
    }

    @Override
    public void play(String audioType, String filename) {
	if (audioType.equals("FLV")) {
	    advnPlayer.playFlv(filename);
	}
	if (audioType.equals("VLC")) {
	    advnPlayer.playVlc(filename);
	}
    }

}
