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
		Command lightCommand = new LightCommand(light, Commands.LIGHT_ON);

		Stereo stereo = new Stereo();
		Command stereoCommand = new StereoCommand(stereo, Commands.STEREO_ON);

		Invoker invoker = new Invoker(lightCommand);
		invoker.pressButton();

		// we can change command dynamically
		invoker = new Invoker(stereoCommand);
		invoker.pressButton();

		stereoCommand = new StereoCommand(stereo, Commands.STEREO_INSERT_DVD);
		invoker = new Invoker(stereoCommand);
		invoker.pressButton();

		stereoCommand = new StereoCommand(stereo, Commands.STEREO_SET_VOLUME);
		invoker = new Invoker(stereoCommand);
		invoker.pressButton();

		stereoCommand = new StereoCommand(stereo, Commands.STEREO_OFF);
		invoker = new Invoker(stereoCommand);
		invoker.pressButton();

		lightCommand = new LightCommand(light, Commands.LIGHT_OFF);
		invoker = new Invoker(lightCommand);
		invoker.pressButton();
	}

}
