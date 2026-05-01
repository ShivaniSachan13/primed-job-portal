package com.webapp.jobportal;

import com.webapp.jobportal.entity.UsersType;
import com.webapp.jobportal.repository.UsersTypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JobportalApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobportalApplication.class, args);
	}

	@Bean
	CommandLineRunner seedUserTypes(UsersTypeRepository usersTypeRepository) {
		return args -> {
			createUserTypeIfMissing(usersTypeRepository, "Recruiter");
			createUserTypeIfMissing(usersTypeRepository, "Job Seeker");
		};
	}

	private void createUserTypeIfMissing(UsersTypeRepository usersTypeRepository, String userTypeName) {
		if (usersTypeRepository.findByUserTypeName(userTypeName).isEmpty()) {
			UsersType usersType = new UsersType();
			usersType.setUserTypeName(userTypeName);
			usersTypeRepository.save(usersType);
		}
	}
}
