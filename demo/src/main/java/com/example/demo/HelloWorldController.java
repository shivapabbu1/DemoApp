package com.example.demo;



import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/")
public class HelloWorldController {

       @GetMapping("helloworld")
       public String getHelloWorld() {
	        return "hello world"; 
	    }
	
       @PostMapping("create")
       public String create(@RequestBody Map<String ,String> payload ) {
    	   return "hello"+ " "+payload.get("name");
       }
}
