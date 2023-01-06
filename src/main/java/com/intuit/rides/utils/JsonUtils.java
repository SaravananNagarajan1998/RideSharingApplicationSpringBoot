package com.intuit.rides.utils;

import net.minidev.json.JSONObject;

public class JsonUtils 
{
	public static final String STATUS ="status";
	public static final String MESSAGE="message";
 public static String responseToJson(int status,String message)
 {
	JSONObject responseObj = new JSONObject();
	addStatusMsg(status,message,responseObj);
	return responseObj.toString();
 }
 public static void addStatusMsg(int status,String message,JSONObject responseObj)
 {
	 responseObj.put(STATUS, status);
	 responseObj.put(MESSAGE,message);
 }
 
}
