package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

@SpringBootApplication
@EntityScan("com.example.demo.subscription.model")
@EnableJpaRepositories("com.example.demo.subscription.repository")
@ComponentScan("com.example.demo")
@EnableWebSocket
@EnableWebSocketMessageBroker
@EnableJpaAuditing
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
