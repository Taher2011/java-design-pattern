package com.behavioral.command_02commandimpl;

import com.behavioral.command_01command.Command;
import com.behavioral.command_04receiver.Light;
import com.behavioral.command_06commandenums.Commands;

public class LightCommand implements Command {

	Light light;

	public LightCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute(Commands commands) {
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
