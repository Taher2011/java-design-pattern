package com.structural.bridge_02refinedabstraction;

import com.structural.bridge_01abstraction.Message;
import com.structural.bridge_03implementor.MessageSender;

public class ShortMessage extends Message {

	public ShortMessage(MessageSender messageSender) {
		super(messageSender);
	}

	@Override
	public void processMessage() {
		messageSender.sendMessage();
	}

}
