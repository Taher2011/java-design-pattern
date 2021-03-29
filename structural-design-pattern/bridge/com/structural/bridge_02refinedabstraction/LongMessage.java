package com.structural.bridge_02refinedabstraction;

import com.structural.bridge_01abstraction.Message;
import com.structural.bridge_03implementor.MessageSender;

public class LongMessage extends Message {

	public LongMessage(MessageSender messageSender) {
		super(messageSender);
	}

	@Override
	public void processMessage() {
		messageSender.sendMessage();
	}

}
