package com.creativefusion.suruthiga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class HappytummyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HappytummyApplication.class, args);
	}

}
