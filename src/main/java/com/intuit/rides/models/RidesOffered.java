package com.intuit.rides.models;

import java.sql.Timestamp;

public class RidesOffered 
{
  String userName;
  String vehicleName;
  String origin;
  String destination;
  int availableSeats;
  int duration;
  String startTime;
  @Override
public String toString() {
	return "RidesOffered [userName=" + userName + ", vehicleName=" + vehicleName + ", origin=" + origin
			+ ", destination=" + destination + ", avilableSeats=" + availableSeats + ", duration=" + duration
			+ ", startTime=" + startTime + "]";
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getVehicleName() {
	return vehicleName;
}
public void setVehicleName(String vehicleName) {
	this.vehicleName = vehicleName;
}
public String getOrigin() {
	return origin;
}
public void setOrigin(String origin) {
	this.origin = origin;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public int getAvilableSeats() {
	return availableSeats;
}
public void setAvilableSeats(int avilableSeats) {
	this.availableSeats = avilableSeats;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public String getStartTime() {
	return startTime;
}
public void setStartTime(String startTime) {
	this.startTime = startTime;
} 
  
}
