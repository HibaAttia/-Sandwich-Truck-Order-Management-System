package com.sandwichTruckSystem.STMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@EnableJpaRepositories("com.sandwichTruckSystem.STMS.*")
//@ComponentScan(basePackages = { "com.sandwichTruckSystem.STMS.*" })
//@EntityScan("my.package.base.*")
@Configuration
@SpringBootApplication
public class StmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StmsApplication.class, args);
	}

}
