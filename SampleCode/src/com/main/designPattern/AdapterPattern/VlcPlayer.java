package com.main.designPattern.AdapterPattern;

public class VlcPlayer implements AdvancePlayer {

    @Override
    public void playVlc(String filename) {
	System.out.println("Playing the VLC file :" + filename);

    }

    @Override
    public void playFlv(String filename) {
	// TODO Auto-generated method stub

    }

}
