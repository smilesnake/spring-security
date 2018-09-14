package com.smilesnake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.smilesnake.config.MVCConfig;
import com.smilesnake.config.SecurityConfiguration;

@SpringBootApplication
@EnableTransactionManagement
@Import({ MVCConfig.class, SecurityConfiguration.class })
@Configuration
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
