package com.Docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
	
	
	@RequestMapping(method=RequestMethod.GET, path="/test")  
	public String helloWorld()  
	{  
	return "Hello World";  
	}  

	

}
