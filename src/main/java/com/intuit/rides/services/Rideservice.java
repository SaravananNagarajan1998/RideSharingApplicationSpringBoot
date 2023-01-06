package com.intuit.rides.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.intuit.rides.models.RidesOffered;
import com.intuit.rides.models.Users;
import com.intuit.rides.repository.UserDetails;
import com.intuit.rides.utils.JsonUtils;

@Service
public class Rideservice
{
Map<String,Users> userMap =UserDetails.getInstance();	
List<Users> userList =new ArrayList(userMap.values());
public ResponseEntity<String> getDriver(String userName,String origin,String destination,String rideMode)
{
	Optional<String> nullRide=Optional.ofNullable(rideMode);
	if(nullRide.isPresent())
	{
		int min=Integer.MAX_VALUE;
		String toReturn="No rides Available";
		if(nullRide.get().equalsIgnoreCase("fastestRide"))
		{
		//userList.stream().map(a->a.getRidesOfferedList()).filter(a->a.forEach(b->b.getDestination()==null)).collect(Collectors.toList());
		//List<List<RidesOffered>> userObj =userList.stream().map(a-edList()).collect(Collectors.toList());

		for(Users user : userList)
		{
			List<RidesOffered> ridesOffered=user.getRidesOfferedList();
		    if(ridesOffered!=null)
		    {
		    	for(RidesOffered offerRide : ridesOffered)
		    	{
		    		if(offerRide.getDestination().equalsIgnoreCase(destination)&&offerRide.getOrigin().equalsIgnoreCase(origin))
		    		{
		    			if(offerRide.getDuration()<min)
		    			{
		    				min=offerRide.getDuration();
		    				toReturn=offerRide.toString();
		    			}
		    		}
		    	}
		    }
			 
		}
	     return ResponseEntity.status(HttpStatus.OK).body(JsonUtils.responseToJson(HttpStatus.OK.value(),toReturn));
		}
		else if(nullRide.get().equalsIgnoreCase("earliestRide"))
		{
			Timestamp currentTime =Timestamp.valueOf("20230-09-09 12:12:12");
			for(Users user : userList)
			{
				List<RidesOffered> ridesOffered=user.getRidesOfferedList();
			    if(ridesOffered!=null)
			    {
			    	for(RidesOffered offerRide : ridesOffered)
			    	{
			    		if(offerRide.getDestination().equalsIgnoreCase(destination)&&offerRide.getOrigin().equalsIgnoreCase(origin))
			    		{
			    		Timestamp time=Timestamp.valueOf(offerRide.getStartTime());
			    		time.setHours(time.getHours()+offerRide.getDuration());
			    		if(time.before(currentTime))
			    		{
			    			toReturn=ridesOffered.toString();
			    		}
			    		}
			    	}
			    }
				 
			}
		     return ResponseEntity.status(HttpStatus.OK).body(JsonUtils.responseToJson(HttpStatus.OK.value(),toReturn));
		}
	}
	return null;
}

}
