package com.behavioral.command_02commandimpl;

import com.behavioral.command_01command.Command;
import com.behavioral.command_04receiver.Stereo;

public class StereoCommand implements Command {

	Stereo stereo;

	public StereoCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute(String command) {
		if ("StereoOn".equals(command)) {
			stereo.stereoOn();
		} else if ("StereoOff".equals(command)) {
			stereo.stereoOff();
		} else if ("StereoInsertDVD".equals(command)) {
			stereo.setDVDInStereo();
		} else if ("StereoSetVolume".equals(command)) {
			stereo.setVolumeOfStereo(25);
		}
	}

}
