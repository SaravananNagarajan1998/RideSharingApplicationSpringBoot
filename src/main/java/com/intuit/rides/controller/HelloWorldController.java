package com.intuit.rides.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
   //
	@RequestMapping(method=RequestMethod.GET,path="/hello-world")
   
   @GetMapping(path="/hello-world")
	public String helloWorld()
	{
		System.out.println("Hello everyone");
		return "HelloWorld";
	}
	@GetMapping(path="/hello-world-bean")
	public String helloWorldBean()
	{
		return null;
	}
	@GetMapping(path="/hello-world-bean/variable/{name}")
	public String helloWorldBeanPathVariable(@PathVariable String name)
	{
		return null;
	}
}
