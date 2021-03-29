package com.structural.bridge_05client;

import com.structural.bridge_01abstraction.Message;
import com.structural.bridge_02refinedabstraction.LongMessage;
import com.structural.bridge_03implementor.MessageSender;
import com.structural.bridge_04concreteimplementor.EmailMessageSender;

public class Client {

	public static void main(String[] args) {

		MessageSender messageSender = new EmailMessageSender();

		Message message = new LongMessage(messageSender);
		message.processMessage();

	}

}
