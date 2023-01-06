package com.intuit.rides.models;

public class Vehicles 
{
  String userName;
  String vehicleName;
  String vehicleNumber;
public Vehicles(String userName, String vehicleName, String vehicleNumber) {
	super();
	this.userName = userName;
	this.vehicleName = vehicleName;
	this.vehicleNumber = vehicleNumber;
}
@Override
public String toString() {
	return "Vehicles [userName=" + userName + ", vehicleName=" + vehicleName + ", VehicleNumber=" + vehicleNumber + "]";
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
public String getVehicleNumber() {
	return vehicleNumber;
}
public void setVehicleNumber(String vehicleNumber) {
	vehicleNumber = vehicleNumber;
}
  
}
