package com.structural.adapter_04adapterclient;

import com.structural.adapter_01target.MediaPlayer;
import com.structural.adapter_01target.Mp3AudioPlayer;
import com.structural.adapter_02adapter.MediaPlayerAdapter;
import com.structural.adapter_03adaptee.AdvancedMediaPlayer;
import com.structural.adapter_03adaptee.Mp4AudioPlayer;
import com.structural.adapter_03adaptee.VlcAudioPlayer;

public class Client {

	public static void main(String[] args) {

		MediaPlayer mediaPlayer = new Mp3AudioPlayer();
		mediaPlayer.playMp3();

		System.out.println();

		AdvancedMediaPlayer vlcmMediaPlayer = new Mp4AudioPlayer();

		// Wrap a AdvancedMediaPlayer in a MediaPlayerAdapter so that it MediaPlayer
		// behaving like a AdvancedMediaPlayer
		MediaPlayer mediaPlayerAdapter = new MediaPlayerAdapter(vlcmMediaPlayer);
		mediaPlayerAdapter.playMp3();
	}

}
