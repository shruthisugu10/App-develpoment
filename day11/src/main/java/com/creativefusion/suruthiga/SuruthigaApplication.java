package com.creativefusion.suruthiga;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.creativefusion.suruthiga.dto.request.RegisterRequest;
import com.creativefusion.suruthiga.service.impl.AuthenticationService;
import com.creativefusion.suruthiga.dto.request.RegisterRequest;
import com.creativefusion.suruthiga.service.impl.AuthenticationService;
import static com.creativefusion.suruthiga.model.Role.USER;
import static com.creativefusion.suruthiga.model.Role.ADMIN;

@SpringBootApplication
@EnableJpaAuditing()
public class SuruthigaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuruthigaApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(
			AuthenticationService service
	) {
		return args -> {
			var admin = RegisterRequest.builder()
										.user_name("Admin")
										.email("admin@mail.com")
										.pass_word("password")
										.role(ADMIN)
										.build();
			System.out.println("Admin token: " + service.register(admin).getAccessToken());

			var user = RegisterRequest.builder()
										.user_name("User")
										.email("user@mail.com")
										.pass_word("password")
										.role(USER)
										.build();
			System.out.println("User token: " + service.register(user).getAccessToken());

		};
	}	
}
