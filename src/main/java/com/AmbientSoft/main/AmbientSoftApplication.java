package com.AmbientSoft.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.AmbientSoft.main.controlador", "com.AmbientSoft.main.Enums",
		"com.AmbientSoft.main.model","com.AmbientSoft.main.repositorio","com.AmbientSoft.main.service"})
public class AmbientSoftApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmbientSoftApplication.class, args);
	}

}