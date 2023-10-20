package com.DbJpa.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User_Table")
public class User {
@Id
@Column(name="User_Id")
	private Integer userId;
@Column(name="User_Name")
	private String userName;
@Column(name="User_Gender")
	private String gender;
@Column(name="User_Age")
	private Integer age;
@Column(name="User_Country")
	private String country;
@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", gender=" + gender + ", age=" + age + ", country="
			+ country + "]";
}
public User(Integer userId, String userName, String gender, Integer age, String country) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.gender = gender;
	this.age = age;
	this.country = country;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public int hashCode() {
	return Objects.hash(age, country, gender, userId, userName);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	return Objects.equals(age, other.age) && Objects.equals(country, other.country)
			&& Objects.equals(gender, other.gender) && Objects.equals(userId, other.userId)
			&& Objects.equals(userName, other.userName);
}

	
}
