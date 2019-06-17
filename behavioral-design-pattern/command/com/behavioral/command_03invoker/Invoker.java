package com.behavioral.command_03invoker;

import com.behavioral.command_01command.Command;

/* Invoker class delegates the command to the specific command controller 
 * i.e either LightCommand or StereoCommand
 */

public class Invoker {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressButton(String action) {
		command.execute(action);
	}
}
