package com.structural.adapter_02adapter;

import com.structural.adapter_01target.MediaPlayer;
import com.structural.adapter_03adaptee.AdvancedMediaPlayer;
import com.structural.adapter_03adaptee.Mp4AudioPlayer;
import com.structural.adapter_03adaptee.VlcAudioPlayer;

public class MediaPlayerAdapter implements MediaPlayer {

	private AdvancedMediaPlayer advancedMediaPlayer;

	public MediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
		super();
		if (advancedMediaPlayer instanceof VlcAudioPlayer) {
			this.advancedMediaPlayer = new VlcAudioPlayer();
		} else if (advancedMediaPlayer instanceof Mp4AudioPlayer) {
			this.advancedMediaPlayer = new Mp4AudioPlayer();
		}

	}

	public void playMp3() {

		System.out.print("Using Adapter ");
		advancedMediaPlayer.playMp4();
		advancedMediaPlayer.playVlc();

	}

}
