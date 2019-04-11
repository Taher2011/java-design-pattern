package com.structural.adapter_02adaptee;

import com.structural.adapter_04enums.MediaType;

public class Mp4AudioPlayer implements AdvancedMediaPlayer {

	public void playMp4(MediaType mediatype) {
		System.out.println("Playing " + mediatype + " file");
	}

	public void playVlc(MediaType mediatype) {
		// do nothing
	}

}
