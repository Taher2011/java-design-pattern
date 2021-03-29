package com.structural.bridge_04concreteimplementor;

import com.structural.bridge_03implementor.MessageSender;

public class EmailMessageSender implements MessageSender {

	@Override
	public void sendMessage() {
		System.out.println("sent message via Email");
	}

}
