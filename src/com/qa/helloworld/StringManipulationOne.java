package com.qa.helloworld;

public class StringManipulationOne {
	public static void main(String[] args) {
		String rain = "yesterday it was raining";
		String sun = "today it is sunny";
		//rain.toUpperCase();
		//sun.toUpperCase();
		
		
		System.out.println(rain.toUpperCase() .concat(sun.toUpperCase()));
		System.out.println(rain.toUpperCase() + ", " + sun.toUpperCase());
		System.out.println(sun.toUpperCase().substring(0, 12) + rain.toUpperCase().substring(17, 24));
	}
	
}
