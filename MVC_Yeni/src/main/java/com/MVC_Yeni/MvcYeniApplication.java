package com.MVC_Yeni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"controller"})
public class MvcYeniApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcYeniApplication.class, args);
	}

}

//MVC PROJESI