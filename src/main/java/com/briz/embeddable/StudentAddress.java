package com.briz.embeddable;

import jakarta.persistence.Embeddable;

@Embeddable  // this will be embedded into the student

public class StudentAddress
{
String street;
String city;
String country;
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}
