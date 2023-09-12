package com.briz.embeddable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
@Autowired
StudentRepository srepo;
@RequestMapping("/test")
public String test()
{
	return "this is test only";
}
@RequestMapping("/save")
public String save()
{
	Student s=new Student();
	s.setName("ranjan");
	s.setAge(90);
	
	StudentAddress sa=new StudentAddress();
	sa.setCity("ranchi");
	sa.setStreet("circular road");
	sa.setCountry("india");
	
	s.setStudentaddress(sa);
	srepo.save(s);
	return "data saved";
}
@RequestMapping("/alldata")
public List<Student> alldata()
{
	return srepo.findAll();
}
}
