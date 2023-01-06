package com.intuit.rides.repository;

import java.util.HashMap;
import java.util.Map;

import com.intuit.rides.models.Users;

public class UserDetails 
{
public static Map<String,Users> userMap= null;
private UserDetails()
{
	
}
public static Map<String,Users>  getInstance()
{
	if(userMap==null)
	{
		return userMap = new HashMap();
	}
	return userMap;
}
}
