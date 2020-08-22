package monu.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import monu.springframework.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {

	private final GreetingService greetingService;

	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return this.greetingService.sayGreeting();
	}
	

}