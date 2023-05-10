package com.ghazalatc.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class SpringmvcApplication implements Runnable{


	public static void main(String[] args) {
		SpringApplication.run(SpringmvcApplication.class, args);


	}

	@Override
	public void run() {
	}
}
