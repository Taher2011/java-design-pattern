package com.structural.adapter_03adaptee;

public class VlcAudioPlayer implements AdvancedMediaPlayer {

	String mediaType = "vlc";

	public void playAdvancedMedia() {
		System.out.println("Playing " + mediaType + " file");
	}

}
