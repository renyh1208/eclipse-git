package com.primeton.renyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*
 * 应用启动类1
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.primeton.renyh" })
public class Application {

	public static void main(String[] args) {
		// springboot 程序的入口
		SpringApplication.run(Application.class, args);
	}

}
