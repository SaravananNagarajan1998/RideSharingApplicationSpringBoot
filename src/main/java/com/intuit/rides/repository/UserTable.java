package com.intuit.rides.repository;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="userDetails")
public class UserTable
{

    @Override
    public String toString() {
        return "UserTable{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public UserTable() {
    }

    public UserTable(int id, String userName, int age, String sex) {
        this.id=id;
        this.userName = userName;
        this.age = age;
        this.sex = sex;
    }
    @Id
    @GeneratedValue
    int id;
    String userName;
    int age;
    String sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
