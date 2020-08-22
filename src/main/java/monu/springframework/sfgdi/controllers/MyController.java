package monu.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import monu.springframework.sfgdi.services.GreetingService;

@Controller
public class MyController {
	
	private final GreetingService greetingService;
	
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayhello() {
		return this.greetingService.sayGreeting();
	}

}
