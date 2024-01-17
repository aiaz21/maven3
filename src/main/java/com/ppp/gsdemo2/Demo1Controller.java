package com.ppp.gsdemo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/demo1")
public class Demo1Controller {
	
	@GetMapping("welcome")
	public String welcome() {
		return "Welcome to Grennsight!!!";
	}

}
