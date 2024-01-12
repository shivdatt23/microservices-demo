package com.org.servicetwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class Service2Rest 
{
	@GetMapping
	public String merry() {
		return "service 2";
	}
}
