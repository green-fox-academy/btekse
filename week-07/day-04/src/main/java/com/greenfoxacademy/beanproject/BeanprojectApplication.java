package com.greenfoxacademy.beanproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanprojectApplication implements CommandLineRunner {
	@Autowired
	HelloWorld helloWorld;

	@Autowired
	MyColor redColor;

	@Autowired
  MyColor blueColor;

	public static void main(String[] args) {
		SpringApplication.run(BeanprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
    helloWorld.setMessage("Aloha World!");
    helloWorld.getMessage();
    redColor.printColor();
    blueColor.printColor();
	}
}
