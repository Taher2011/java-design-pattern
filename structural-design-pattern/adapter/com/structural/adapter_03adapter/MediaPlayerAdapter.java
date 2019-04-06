package com.structural.adapter_03adapter;

import com.structural.adapter_01target.MediaPlayer;
import com.structural.adapter_02adaptee.AdvancedMediaPlayer;
import com.structural.adapter_02adaptee.Mp4AudioPlayer;
import com.structural.adapter_02adaptee.VlcAudioPlayer;
import com.structural.adapter_04enums.MediaType;

public class MediaPlayerAdapter implements MediaPlayer {

	private MediaType mediatype;
	private AdvancedMediaPlayer advancedMediaPlayer;

	public MediaPlayerAdapter(MediaType mediatype) {
		super();
		this.mediatype = mediatype;
		switch (mediatype) {
		case VLC:
			this.advancedMediaPlayer = new VlcAudioPlayer();
			break;
		case MP4:
			this.advancedMediaPlayer = new Mp4AudioPlayer();
			break;
		}
	}

	public void playMp3() {

		System.out.print("Using Adapter ");

		if (mediatype.equals(MediaType.MP4)) {
			advancedMediaPlayer.playMp4(mediatype);
		} else if (mediatype.equals(MediaType.VLC)) {
			advancedMediaPlayer.playVlc(mediatype);
		} else {
			System.out.println("Invalid file format and don't support for " + mediatype);
		}

	}

}
