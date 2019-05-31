package com.training.mavenbasic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	//expose Student Service Bean
	@Bean
	public StudentService getStudentService() {
		return new StudentServiceImpl();
	}
}
