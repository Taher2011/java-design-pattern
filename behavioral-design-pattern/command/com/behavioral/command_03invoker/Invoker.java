package com.behavioral.command_03invoker;

import com.behavioral.command_01command.Command;
import com.behavioral.command_06commandenums.Commands;

/* Invoker class delegates the command to the specific command controller 
 * i.e either LightCommand or StereoCommand
 */

public class Invoker {

	private Command command;

	public Invoker(Command command) {
		super();
		this.command = command;
	}

	public void pressButton(Commands action) {
		command.execute(action);
	}
}
