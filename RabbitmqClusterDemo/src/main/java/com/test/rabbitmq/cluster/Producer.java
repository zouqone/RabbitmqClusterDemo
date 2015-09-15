package com.test.rabbitmq.cluster;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Producer {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		AmqpTemplate template = ctx.getBean(AmqpTemplate.class);
		template.convertAndSend("Hello, world!!");
		ctx.close();
	}

}
