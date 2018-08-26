package hd.boot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = { "hd.boot.jpa.controller" })
// @EnableJpaRepositories(basePackages = "com.example.demo.persist")
// @EntityScan(basePackages = "hd.boot.jpa.entity")
@EnableJpaAuditing
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
