package com.briz.embeddable;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="student")
public class Student 
{
@Id
@GeneratedValue  // nothing is mentioned here be careful with nature 
int id;
String name;
int age;
@Embedded  // be careful about this annotation 
StudentAddress studentaddress;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public StudentAddress getStudentaddress() {
	return studentaddress;
}
public void setStudentaddress(StudentAddress studentaddress) {
	this.studentaddress = studentaddress;
}
}
