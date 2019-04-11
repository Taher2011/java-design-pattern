package com.behavioral.command_04receiver;

public class Stereo {

	public void stereoOn() {
		System.out.println("Stereo is on");
	}

	public void stereoOff() {
		System.out.println("Stereo is off");
	}

	public void setDVDInStereo() {
		System.out.println("Stereo is set" + " for DVD input");
	}

	public void setVolumeOfStereo(int volume) {
		System.out.println("Stereo volume set" + " to " + volume);
	}
}
