package com.in28minutes.learnspringframework.db;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BusinessCalculationApplication {

	public static void main(String[] args) {
		System.out.println("main");
		try (var context = new AnnotationConfigApplicationContext(BusinessCalculationApplication.class)) {
			
			System.out.println("경계선1");
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println("경계선2");
			
			context.getBean(BusinessCalculationService.class).findMax();

		}
	}
}
