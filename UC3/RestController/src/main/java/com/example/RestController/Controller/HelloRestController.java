package com.example.RestController.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

		@RequestMapping("/")
		public String sayHello() {
			return "Hello using Rest";
		}
		
		
	}


