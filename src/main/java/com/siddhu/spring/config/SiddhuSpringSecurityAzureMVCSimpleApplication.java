package com.siddhu.spring.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SiddhuSpringSecurityAzureMVCSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiddhuSpringSecurityAzureMVCSimpleApplication.class, args);		
		/*SpringApplication app = new SpringApplication(SiddhuSpringSecurityAzureSimpleApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8181"));
        app.run(args);*/
	}

}
