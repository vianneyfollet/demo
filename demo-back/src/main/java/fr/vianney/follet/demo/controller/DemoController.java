package fr.vianney.follet.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

	 @GetMapping(value="/{test}", produces = "application/json")
     public String hello(@PathVariable("test") String test) {
            return test;
     }
	
}
