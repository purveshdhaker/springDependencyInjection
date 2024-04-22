package com.springFramework.sfgdi;

import com.springFramework.sfgdi.config.SfgConfiguration;
import com.springFramework.sfgdi.config.SfgConstructorConfig;
import com.springFramework.sfgdi.controller.*;
import com.springFramework.sfgdi.dataSource.FakeDataSource;
import com.springFramework.sfgdi.services.PrototypeBean;
import com.springFramework.sfgdi.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@SpringBootApplication
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

		System.out.println("----------Bean Scopes--------------");
		SingletonBean singletonBean1=context.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyScope());
		SingletonBean singletonBean2=context.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());

		PrototypeBean prototypeBean1=context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		PrototypeBean prototypeBean2=context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());

		System.out.println("--------FakeDatasource--------------");
		FakeDataSource fakeDataSource=context.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcurl());

		System.out.println("----------ConfigPropBean--------------");
		SfgConfiguration sfgConfiguration=context.getBean(SfgConfiguration.class);
		System.out.println(sfgConfiguration.getUsername());
		System.out.println(sfgConfiguration.getPassword());
		System.out.println(sfgConfiguration.getJdbcurl());

		System.out.println("----------Constructor Binding--------------");
		SfgConstructorConfig sfgConstructorConfig=context.getBean(SfgConstructorConfig.class);
		System.out.println(sfgConstructorConfig.getUsername());
		System.out.println(sfgConstructorConfig.getPassword());
		System.out.println(sfgConstructorConfig.getJdbcurl());

	}

}
