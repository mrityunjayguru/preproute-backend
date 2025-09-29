package com.preproute.preproute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@ServletComponentScan
@SpringBootApplication
@ComponentScan({"com.preproute.preproute"})
@EntityScan("com.preproute.preproute.*")
@EnableJpaRepositories("com.preproute.preproute.*")
@EnableWebMvc
/*@EnableConfigurationProperties({
    FileStorageProperties.class
})*/


public class PreprouteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PreprouteApplication.class, args);
	}

}
