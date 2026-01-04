package net.javagudies.springboot_ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("net.javaguides.ems.entity")
@EnableJpaRepositories("net.javaguides.ems.repository")
@ComponentScan(basePackages = "net.javaguides.ems")

public class SpringbootEmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEmsApplication.class, args);
	}

}
