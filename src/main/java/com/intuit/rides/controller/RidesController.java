package com.intuit.rides.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.intuit.rides.models.RidesOffered;
import com.intuit.rides.models.Users;
import com.intuit.rides.models.Vehicles;
import com.intuit.rides.repository.RepoSingleton;
import com.intuit.rides.services.Rideservice;

@RestController
@RequestMapping("/rides")

public class RidesController 
{
@Autowired RepoSingleton repoSingleton;	
@Autowired Rideservice rideService;

@PostMapping(value ="/adduser", produces = "application/json")
public ResponseEntity<String> addUser(@RequestBody Users user)
{
	return repoSingleton.addUser(user);
}

@PostMapping(value="/addvehicle", produces ="application/json")
public ResponseEntity<String> addVehicle(@RequestBody Vehicles vehicle)
{
	return repoSingleton.addVehicles(vehicle);
}

@PostMapping(value="/offerride", produces="application/json")
public ResponseEntity<String> offerRide(@RequestBody RidesOffered ridesOffered)
{
	return repoSingleton.offerRide(ridesOffered);
}
@GetMapping(path ="/getuser/{userName}" ,produces = "application/json")
public ResponseEntity<String> getUser(@PathVariable String userName)
{
	return repoSingleton.getUser(userName);
}
@GetMapping(value="/findrides",produces="application/json")
public ResponseEntity<String> getRides(@RequestParam String userName,@RequestParam String origin,@RequestParam String destination,@RequestParam String rideMode)
{
     rideService.getDriver(userName, origin, destination, rideMode);
	return null;
}
}
