package com.behavioral.command_01command;

import com.behavioral.command_06commandenums.Commands;

public interface Command {
	/*
	 * execute() receives a command from invoker and invokes right action on
	 * receiver
	 */
	void execute(Commands commands);

}
