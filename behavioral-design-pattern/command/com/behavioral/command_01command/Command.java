package com.behavioral.command_01command;

public interface Command {
	/*
	 * execute() receives a command from invoker and invokes right action on
	 * receiver
	 */
	void execute(String command);

}
