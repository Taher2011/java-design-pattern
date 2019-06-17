package com.behavioral.command_05commandclient;

import com.behavioral.command_01command.Command;
import com.behavioral.command_02commandimpl.LightCommand;
import com.behavioral.command_02commandimpl.StereoCommand;
import com.behavioral.command_03invoker.Invoker;
import com.behavioral.command_04receiver.Light;
import com.behavioral.command_04receiver.Stereo;
import com.behavioral.command_06commandenums.Commands;

public class Client {

	public static void main(String[] args) {

		Light light = new Light();
		Command lightCommand = new LightCommand(light);

		Stereo stereo = new Stereo();
		Command stereoCommand = new StereoCommand(stereo);

		Invoker invoker = new Invoker();

		invoker.setCommand(lightCommand);
		invoker.pressButton(Commands.LIGHT_ON);

		// we can change command dynamically
		invoker.setCommand(stereoCommand);
		invoker.pressButton(Commands.STEREO_ON);
		invoker.pressButton(Commands.STEREO_INSERT_DVD);
		invoker.pressButton(Commands.STEREO_SET_VOLUME);
		invoker.pressButton(Commands.STEREO_OFF);

		invoker.setCommand(lightCommand);
		invoker.pressButton(Commands.LIGHT_OFF);
	}

}
