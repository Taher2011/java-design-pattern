package com.behavioral.command_02commandimpl;

import com.behavioral.command_01command.Command;
import com.behavioral.command_04receiver.Light;

public class LightCommand implements Command {

	Light light;

	public LightCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute(String command) {
		if ("LightOn".equals(command)) {
			light.turnOnLight();
		} else if ("LightOff".equals(command)) {
			light.turnOffLight();
		}
	}

}
