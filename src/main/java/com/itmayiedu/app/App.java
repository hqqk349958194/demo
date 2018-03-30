package com.itmayiedu.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages={"com.itmayiedu.controller","com.itmayiedu.service"})
//@ComponentScan(basePackages={"com.itmayiedu.yml.controller"})
@EnableJpaRepositories("com.itmayiedu.dao")
@EnableAutoConfiguration
@EntityScan("com.itmayiedu.entity")
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
