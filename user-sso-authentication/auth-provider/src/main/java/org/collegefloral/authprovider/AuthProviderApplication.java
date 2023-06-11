package org.collegefloral.authprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.collegefloral.authprovider")
public class AuthProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthProviderApplication.class, args);
	}

}
