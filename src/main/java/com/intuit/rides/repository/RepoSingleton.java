package com.intuit.rides.repository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.intuit.rides.models.RidesOffered;
import com.intuit.rides.models.Users;
import com.intuit.rides.models.Vehicles;
import com.intuit.rides.services.Rideservice;
import com.intuit.rides.utils.JsonUtils;

@Component
public class RepoSingleton 
{
 Map<String,Users> repoObj =UserDetails.getInstance();
 @Autowired Rideservice rideService;
  
   public ResponseEntity<String> addUser(Users user) 
   {
	   if(repoObj.containsKey(user.getUserName()))
		 {
		   return ResponseEntity.status(HttpStatus.OK).body(JsonUtils.responseToJson(HttpStatus.OK.value(),"userAlreadyPresent"));
		 }
	   repoObj.put(user.getUserName(),user);
	   return ResponseEntity.status(HttpStatus.OK).body(JsonUtils.responseToJson(HttpStatus.OK.value(),"userAddedSuccessful"));
	   
   }
   
   public ResponseEntity<String> addVehicles(Vehicles vehicle)
   {
	   if(repoObj.containsKey(vehicle.getUserName()))
	   {
		  repoObj.get(vehicle.getUserName()).getVehicleList().add(vehicle); 
		  return ResponseEntity.status(HttpStatus.OK).body(JsonUtils.responseToJson(HttpStatus.OK.value(),"VehicleAddedSuccessful"));
	   }
	   return ResponseEntity.status(HttpStatus.OK).body(JsonUtils.responseToJson(HttpStatus.OK.value(),"pls add user First"));
   }
   public ResponseEntity<String> offerRide(RidesOffered ridesOffered)
   {
	   if(repoObj.containsKey(ridesOffered.getUserName()))
	   {
		  repoObj.get(ridesOffered.getUserName()).getRidesOfferedList().add(ridesOffered);
		  return ResponseEntity.status(HttpStatus.OK).body(JsonUtils.responseToJson(HttpStatus.OK.value(),"RidesAddedSuccessful"));
	   }
	   return ResponseEntity.status(HttpStatus.OK).body(JsonUtils.responseToJson(HttpStatus.OK.value(),"pls add user First")); 
   }
   public ResponseEntity<String> getUser(String userName)
   {
	  if(repoObj.containsKey(userName))
	  {
		  return ResponseEntity.status(HttpStatus.OK).body(JsonUtils.responseToJson(HttpStatus.OK.value(),repoObj.get(userName).toString()));
	  }
	  return ResponseEntity.status(HttpStatus.OK).body(JsonUtils.responseToJson(HttpStatus.OK.value(),"No user is present"));
   }
}
