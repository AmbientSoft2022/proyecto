package com.AmbientSoft.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.AmbientSoft.main.controlador"})
public class AmbientSoftApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmbientSoftApplication.class, args);
	}

}