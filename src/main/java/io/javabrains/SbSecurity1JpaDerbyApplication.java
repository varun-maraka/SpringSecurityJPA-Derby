package io.javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.javabrains.controller.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SbSecurity1JpaDerbyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbSecurity1JpaDerbyApplication.class, args);
	}

}
