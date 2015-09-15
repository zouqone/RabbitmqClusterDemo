package com.test.rabbitmq.cluster;

public class Consumer {

	public void onMessage(String message) {
		System.out.println("message :" + message);
	}

}
