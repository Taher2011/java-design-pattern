package com.behavioral.command_02commandimpl;

import com.behavioral.command_01command.Command;
import com.behavioral.command_04receiver.Stereo;
import com.behavioral.command_06commandenums.Commands;

public class StereoCommand implements Command {

	Stereo stereo;

	public StereoCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute(Commands commands) {
		switch (commands) {
		case STEREO_ON:
			stereo.stereoOn();
			break;
		case STEREO_OFF:
			stereo.stereoOff();
			break;
		case STEREO_SET_VOLUME:
			stereo.setVolumeOfStereo(25);
			break;
		case STEREO_INSERT_DVD:
			stereo.setDVDInStereo();
			break;
		default:
			break;
		}
	}
}
