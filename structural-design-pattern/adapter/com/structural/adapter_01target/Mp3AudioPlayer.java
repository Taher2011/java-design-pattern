package com.structural.adapter_01target;

public class Mp3AudioPlayer implements MediaPlayer {

	String mediaType = "mp3";

	public void playLegacyMediaType() {
		System.out.println("Playing " + mediaType + " file");
	}

}
