package com.behavioral.command_02commandimpl;

import com.behavioral.command_01command.Command;
import com.behavioral.command_04receiver.Light;
import com.behavioral.command_06commandenums.Commands;

public class LightCommand implements Command {

	Light light;
	Commands commands;

	public LightCommand(Light light, Commands commands) {
		super();
		this.light = light;
		this.commands = commands;
	}

	@Override
	public void execute() {
		switch (commands) {
		case LIGHT_ON:
			light.turnOnLight();
			break;
		case LIGHT_OFF:
			light.turnOffLight();
			break;
		default:
			break;
		}
	}
}
