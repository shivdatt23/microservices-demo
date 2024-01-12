package com.org.serviceone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class MyService1Rest 
{
	
	@Autowired
	Service2Client client;
	
	@GetMapping
	public String msg() {
		
		String str = client.fetchFromService2();
		return str+"\nservice 1 executed";
	}
}
