package com.behavioral.command_05commandclient;

import com.behavioral.command_01command.Command;
import com.behavioral.command_02commandimpl.LightCommand;
import com.behavioral.command_02commandimpl.StereoCommand;
import com.behavioral.command_03invoker.Invoker;
import com.behavioral.command_04receiver.Light;
import com.behavioral.command_04receiver.Stereo;

public class Client {

	public static void main(String[] args) {

		Light light = new Light();
		Command lightCommand = new LightCommand(light);

		Stereo stereo = new Stereo();
		Command stereoCommand = new StereoCommand(stereo);

		Invoker invoker = new Invoker();

		invoker.setCommand(lightCommand);
		String action = "LightOn";
		invoker.pressButton(action);

		// we can change command dynamically
		invoker.setCommand(stereoCommand);
		action = "StereoOn";
		invoker.pressButton(action);
		invoker.pressButton("StereoInsertDVD");
		invoker.pressButton("StereoSetVolume");
		invoker.pressButton("StereoOff");

		invoker.setCommand(lightCommand);
		action = "LightOff";
		invoker.pressButton(action);
	}

}
