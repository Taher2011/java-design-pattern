package com.behavioral.command_02commandimpl;

import com.behavioral.command_01command.Command;
import com.behavioral.command_04receiver.Light;

public class LightOffCommand implements Command {

	Light light;

	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOffLight();
	}

}
