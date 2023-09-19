package com.example.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan

public class Demo11Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo11Application.class, args);
		System.out.println("ram");
		AnnotationConfigApplicationContext applContext=new AnnotationConfigApplicationContext(Demo11Application .class);
		System.out.println(applContext);
		local local=(local)applContext.getBean("local");
		local.video.like();
		System.out.println(local);
	}

}
