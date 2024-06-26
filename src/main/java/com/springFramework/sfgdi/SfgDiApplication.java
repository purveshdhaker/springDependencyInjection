package com.springFramework.sfgdi;

import com.springFramework.sfgdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SfgDiApplication.class, args);
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		PetController petController = context.getBean("petController", PetController.class);
		System.out.println("-------- The Best Pet is --------");
		System.out.println(petController.whichPetIsTheBest());

		I18nController i18nController = context.getBean(I18nController.class);
		System.out.println(i18nController.getGreeting());

		MyController myController =  context.getBean(MyController.class);
//		String greeting = myController.hello();
//		System.out.println(greeting);

		System.out.println("----------Primary Bean--------------");
		System.out.println(myController.getGreeting());


		System.out.println("----------Property--------------");

		PropertyInjectController propertyInjectController=(PropertyInjectController) context.getBean("propertyInjectController");
		System.out.println(propertyInjectController.getGreet());

		System.out.println("----------Setter--------------");

		SetterInjectedController setterInjectedController=(SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.setGreeting());

		System.out.println("----------Constructor--------------");

		ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
