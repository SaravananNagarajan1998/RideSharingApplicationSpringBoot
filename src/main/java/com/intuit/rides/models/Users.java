package com.intuit.rides.models;

import java.util.ArrayList;
import java.util.List;

/*import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data*/
public class Users
{
  String userName;
  String sex;
  int age;
  List<Vehicles> vehicleList = new ArrayList();
  List<RidesOffered> ridesOfferedList = new ArrayList();
public List<Vehicles> getVehicleList() {
	return vehicleList;
}
@Override
public String toString() {
	return "Users [userName=" + userName + ", sex=" + sex + ", age=" + age + ", vehicleList=" + vehicleList
			+ ", ridesOfferedList=" + ridesOfferedList + "]";
}
public void setVehicleList(List<Vehicles> vehicleList) {
	this.vehicleList = vehicleList;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public List<RidesOffered> getRidesOfferedList() {
	return ridesOfferedList;
}
public void setRidesOfferedList(List<RidesOffered> ridesOfferedList) {
	this.ridesOfferedList = ridesOfferedList;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
