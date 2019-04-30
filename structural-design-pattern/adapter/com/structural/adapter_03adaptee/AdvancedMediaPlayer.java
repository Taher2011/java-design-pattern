package com.structural.adapter_03adaptee;

import com.structural.adapter_04enums.MediaType;

public interface AdvancedMediaPlayer {

	public void playMp4(MediaType mediatype);

	public void playVlc(MediaType mediatype);

}
