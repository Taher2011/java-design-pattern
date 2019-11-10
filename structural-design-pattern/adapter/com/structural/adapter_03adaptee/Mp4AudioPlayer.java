package com.structural.adapter_03adaptee;

public class Mp4AudioPlayer implements AdvancedMediaPlayer {

	String mediatype = "mp4";

	public void playMp4() {
		System.out.println("Playing " + mediatype + " file");
	}

	public void playVlc() {
		// do nothing
	}

}
