package com.qa.helloworld;

public class ResultsProgram {
	public static int physics;
	public static int chemistry;
	public static int biology;
	public static int total;
	public static double percentage;
	
	public static void main (String[] args) {
		Score(100, 100, 100);
		Percent();
	}
	
	public static void Score(int physics, int chemistry, int biology) {
		total = physics + chemistry + biology;
		System.out.println("The score for physics is " + physics);
		System.out.println("The score for chem is " + chemistry);
		System.out.println("The score for bio is " + biology);
		System.out.println("The total score for the exams is " + total);
	}
	public static void Percent() {
		percentage = (total * 100) / 450;
		System.out.println("The total percentage is: " + percentage +"%");
	}
}
