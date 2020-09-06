package com.springrest.springrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Student;

@RestController
public class MyController {

	@GetMapping("/home")
	public String home() {
		return "welcome to first 1 controller WEB API";
	}

	@GetMapping("/jsondata")
	public Student jsondata() {
		Student s = new Student();
		System.out.println("student is " + s.toString());
		return s;
	}
	
//	@GetMapping("/arrayList")
//	public ArrayList<Student> studentHere(){
//		Student s = new Student();
//		Student s1 = new Student();
//		List<Student> list = new ArrayList<>();
//	    return (ArrayList<Student>) list;
//	}
	
	@GetMapping("/list")
	public List<Greeting> greeting() {
	    Greeting greeting1 = new Greeting(1, "One");
	    Greeting greeting2 = new Greeting(2, "Two");
	    List<Greeting> list = new ArrayList<>();
	    list.add(greeting1);
	    list.add(greeting2);
	    return list;
	}
	
	@GetMapping("/viewAllCarDetailList")
    public List<CarDetail> retrieveAllCarDetails() {
        List<CarDetail> contacts = new ArrayList<CarDetail>();

        CarDetail c = new CarDetail("i10","limited edition");
        CarDetail c1 = new CarDetail("i10","limited edition");
        contacts.add(c);
        contacts.add(c1);
        return contacts;
    }
	
	
	
}
