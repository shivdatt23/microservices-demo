package com.org.serviceone;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(url="localhost:8086",value="Service-2")
@FeignClient(name="SERVICE-2")
public interface Service2Client {
	
	
	@GetMapping("/service2")
	String fetchFromService2() ;
	
	
}
