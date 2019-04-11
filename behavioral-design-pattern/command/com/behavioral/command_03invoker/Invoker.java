package com.behavioral.command_03invoker;

import com.behavioral.command_01command.Command;

public class Invoker {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressButton() {
		command.execute();
	}
}
