package com.structural.adapter_03adaptee;

public class Mp4AudioPlayer implements AdvancedMediaPlayer {

	String mediaType = "mp4";

	public void playAdvancedMedia() {
		System.out.println("Playing " + mediaType + " file");
	}

}
