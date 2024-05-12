package com.ep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

// 使用@EnableAsync 开启 Spring 异步
@EnableAsync
@SpringBootApplication
public class EventProcessingExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventProcessingExampleApplication.class, args);
	}

}
