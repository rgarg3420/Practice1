package com.main.designPattern.AdapterPattern;

public class FlvPlayer implements AdvancePlayer {

    @Override
    public void playVlc(String filename) {
	// TODO Auto-generated method stub

    }

    @Override
    public void playFlv(String filename) {
	System.out.println("Playing the FLV file :" + filename);
    }

}
