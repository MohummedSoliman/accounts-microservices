package com.eazybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microService REST API Documentation",
				description = "EazyBank Accounts microservice API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Mohamed Ibrahim",
						email = "mohamed@mail.com",
						url = "http://mohamed.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "http://mohamed.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "EazyBank Accounts MicroServices REST API Documentation"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
