package com.structural.adapter_03adaptee;

public class VlcAudioPlayer implements AdvancedMediaPlayer {

	String mediatype = "vlc";

	public void playVlc() {
		System.out.println("Playing " + mediatype + " file");
	}

	public void playMp4() {
		// Do nothing
	}

}
