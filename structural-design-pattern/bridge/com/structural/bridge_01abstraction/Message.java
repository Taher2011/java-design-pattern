package com.structural.bridge_01abstraction;

import com.structural.bridge_03implementor.MessageSender;

public abstract class Message {

	protected MessageSender messageSender;

	public Message(MessageSender messageSender) {
		super();
		this.messageSender = messageSender;
	}

	public abstract void processMessage();

}
