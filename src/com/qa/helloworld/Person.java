package com.qa.helloworld;

public class Person {
	
	private double height;
	private String name;
	private double shoeSize;
	private String jobTitle;
	private int age;
	
	public Person(double height, String name, double shoeSize, String jobTitle, int age) {
		
		this.height = height;
		this.name = name;
		this.shoeSize = shoeSize;
		this.jobTitle = jobTitle;
		this.age = age;
	}

	public Person(double height, String name) {
		this.height = height;
		this.name = name;
	}
	
	public void nextCandidate() {
		System.out.println("The next Candidate is " + name + " who has applied for the role of " +jobTitle);
		
	}
	public void candidateEligibility() {
		if(age>21) {
			System.out.println(name + " is " + age + " years old so meets the criteria");
		}
		else {
			System.out.println(name + " is " + age + " years old so does not meet the criteria");
		}
	}
	
	
	

}
