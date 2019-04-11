package com.structural.adapter_05client;

import com.structural.adapter_01target.MediaPlayer;
import com.structural.adapter_01target.Mp3AudioPlayer;
import com.structural.adapter_03adapter.MediaPlayerAdapter;
import com.structural.adapter_04enums.MediaType;

public class Client {

	public static void main(String[] args) {

		MediaPlayer mediaPlayer = new Mp3AudioPlayer();
		mediaPlayer.playMp3();

		System.out.println();

		MediaPlayer mediaPlayerAdapter = new MediaPlayerAdapter(MediaType.VLC);
		mediaPlayerAdapter.playMp3();
	}

}
