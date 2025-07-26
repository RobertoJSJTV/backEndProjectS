package com.management.sigma_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.mangaement.sigma_management.repository")
public class SigmaManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SigmaManagementApplication.class, args);
	}

}
