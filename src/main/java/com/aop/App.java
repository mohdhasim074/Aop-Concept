  package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.PaymentService;

public class App {
	public static void main(String[] args) {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");

		ApplicationContext context = new ClassPathXmlApplicationContext(" com/aop/config.xml");
		PaymentService payObject = context.getBean("payment", PaymentService.class);

		System.out.println("++++++++++++++++++++++++++++++++");

//		auth, print: payment Started
		payObject.makePayment(1000);

	}
}
