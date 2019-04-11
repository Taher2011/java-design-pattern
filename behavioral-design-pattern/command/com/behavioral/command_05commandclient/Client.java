package com.behavioral.command_05commandclient;

import com.behavioral.command_01command.Command;
import com.behavioral.command_02commandimpl.LightOffCommand;
import com.behavioral.command_02commandimpl.LightOnCommand;
import com.behavioral.command_02commandimpl.StereoOffCommand;
import com.behavioral.command_02commandimpl.StereoOnWithCDCommand;
import com.behavioral.command_03invoker.Invoker;
import com.behavioral.command_04receiver.Light;
import com.behavioral.command_04receiver.Stereo;

public class Client {

	public static void main(String[] args) {

		Light light = new Light();
		Command onLightCommand = new LightOnCommand(light);
		Command offLightCommand = new LightOffCommand(light);

		Stereo stereo = new Stereo();
		Command onStereoCommand = new StereoOnWithCDCommand(stereo);
		Command offStereoCommand = new StereoOffCommand(stereo);

		Invoker invoker = new Invoker();

		invoker.setCommand(onLightCommand);
		invoker.pressButton();

		// we can change command dynamically
		invoker.setCommand(onStereoCommand);
		invoker.pressButton();

		// we can change command dynamically
		invoker.setCommand(offStereoCommand);
		invoker.pressButton();

		// we can change command dynamically
		invoker.setCommand(offLightCommand);
		invoker.pressButton();
	}

}
