package com.intuit.rides.controller;

import com.intuit.rides.repository.UserDetails;
import com.intuit.rides.repository.UserDetailsRepository;
import com.intuit.rides.repository.UserTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloWorldController
{
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	@RequestMapping(method=RequestMethod.GET,path="/hello-world")
   
   @GetMapping(path="/hello-world")
	public String helloWorld()
	{
		UserTable userTable =userDetailsRepository.getById(4);
		List<UserTable> userTableList=userDetailsRepository.findByUserName(userTable.getUserName());
		System.out.println("Hello everyone");
		return userTableList.get(0).toString();
	}
	@GetMapping(path="/test-hello-world")
	public String addUsers()
	{
		//UserTable userTable = new UserTable(1003,"RogerFederer",40,"Male");
		UserTable userTable = new UserTable();
		userTable.setUserName("rafelNadal");
		userTable.setAge(35);
		userTable.setSex("Male");
		UserTable userTab2le=userDetailsRepository.save(userTable);
		return "UserDetails added "+userTable.getUserName();
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
