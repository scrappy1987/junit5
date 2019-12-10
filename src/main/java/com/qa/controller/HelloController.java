package com.qa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qa.service.HelloService;

@Controller
public class HelloController {

    private HelloService helloService;
    
    public HelloController(HelloService helloService) {
		this.helloService = helloService;
	}
	
	@ResponseBody
    @GetMapping("/")
    public String hello() {
        return helloService.get();
    }

}
