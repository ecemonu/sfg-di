package monu.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import monu.springframework.sfgdi.controllers.ConstructorInjectedController;
import monu.springframework.sfgdi.controllers.I18nController;
import monu.springframework.sfgdi.controllers.MyController;
import monu.springframework.sfgdi.controllers.PropertyInjectedController;
import monu.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctxt  = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nCtrl = (I18nController) ctxt.getBean("i18nController");
		System.out.println(i18nCtrl.sayGreeting());
		
		System.out.println("=== primary");
		MyController myCtrl = (MyController) ctxt.getBean("myController");
		System.out.println(myCtrl.sayhello());
		
		System.out.println("=== property");
		
		PropertyInjectedController PiController = (PropertyInjectedController) ctxt.getBean("propertyInjectedController");
		System.out.println(PiController.getGreeting());
		
		System.out.println("=== setter");
		
		SetterInjectedController siController = (SetterInjectedController) ctxt.getBean("setterInjectedController");
		System.out.println(siController.getGreeting());
		
		System.out.println("=== constructor");
		
		ConstructorInjectedController ciController =(ConstructorInjectedController) ctxt.getBean("constructorInjectedController");
		System.out.println(ciController.getGreeting());
		
	}

}
