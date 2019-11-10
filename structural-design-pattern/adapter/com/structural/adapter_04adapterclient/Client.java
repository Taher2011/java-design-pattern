package com.structural.adapter_04adapterclient;

import com.structural.adapter_01target.MediaPlayer;
import com.structural.adapter_01target.Mp3AudioPlayer;
import com.structural.adapter_02adapter.MediaPlayerAdapter;
import com.structural.adapter_03adaptee.AdvancedMediaPlayer;
import com.structural.adapter_03adaptee.VlcAudioPlayer;

public class Client {

	public static void main(String[] args) {

		MediaPlayer mediaPlayer = new Mp3AudioPlayer();
		mediaPlayer.playLegacyMediaType();

		System.out.println();

		AdvancedMediaPlayer vlcmMediaPlayer = new VlcAudioPlayer();

		// Wrap a AdvancedMediaPlayer in a MediaPlayerAdapter so that it MediaPlayer
		// behaving like a AdvancedMediaPlayer
		MediaPlayer mediaPlayerAdapter = new MediaPlayerAdapter(vlcmMediaPlayer);
		mediaPlayerAdapter.playLegacyMediaType();
	}

}
