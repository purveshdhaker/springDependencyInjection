package com.springFramework.sfgdi;

import com.springFramework.sfgdi.controller.ConstructorInjectedController;
import com.springFramework.sfgdi.controller.MyController;
import com.springFramework.sfgdi.controller.PropertyInjectController;
import com.springFramework.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SfgDiApplication.class, args);
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) context.getBean(MyController.class);
		String greeting = myController.hello();
		System.out.println(greeting);


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
