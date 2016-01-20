package com.main.designPattern.AdapterPattern;

public class AdapterMain {

    public static void main(String[] args) {

	AudioPlayer player = new AudioPlayer();

	String audioType = "VLC";
	String fileName = "The Big Bang.";

	player.play(audioType, fileName);

	String audioType1 = "FLV";
	String fileName1 = "Roy";

	player.play(audioType1, fileName1);

    }

}
