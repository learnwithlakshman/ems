package com.lwl.ems.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SamplController {

	
		@Value("${greet.message}")
		private String message;
		
		@GetMapping
		public String greet() {
			return message;
		}
}
