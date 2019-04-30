package com.structural.adapter_03adaptee;

import com.structural.adapter_04enums.MediaType;

public class VlcAudioPlayer implements AdvancedMediaPlayer {

	public void playVlc(MediaType mediatype) {
		System.out.println("Playing " + mediatype + " file");
	}

	public void playMp4(MediaType mediatype) {
		// Do nothing
	}

}
