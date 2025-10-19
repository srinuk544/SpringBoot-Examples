package com.spring.util;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.spring.model.UserEntity;
import com.spring.repository.UserRepository;

@Component
public class DataLoader {

	@Bean
	CommandLineRunner initDatabase(UserRepository repo, PasswordEncoder encoder) {
		return args -> {
			if (repo.findAll().isEmpty()) {
				repo.save(new UserEntity("user", encoder.encode("password"), "USER"));
				repo.save(new UserEntity("admin", encoder.encode("admin123"), "ADMIN"));
			}
		};
	}
}