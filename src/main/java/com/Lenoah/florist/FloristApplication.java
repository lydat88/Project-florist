package com.Lenoah.florist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FloristApplication {

	public static void main(String[] args) {
		var emailService = new EmailService();
		SpringApplication.run(FloristApplication.class, args);
		var orderService = new OrderService(emailService);
		orderService.checkout();
	}
}
