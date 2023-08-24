package br.com.dominio.rdeweb3api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.dominio.rdeweb3api.repository")
@EntityScan(basePackages = "br.com.dominio.rdeweb3api.model")
public class Rdeweb3apiApplication {
	public static void main(String[] args) {
		SpringApplication.run(Rdeweb3apiApplication.class, args);
	}
}

