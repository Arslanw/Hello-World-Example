package com.qa.helloworld;

public class Runner {
	public static void main(String[] args) {
		Person candidateOne = new Person(175, "David", 9, "Software Engineer",20);
		Person candidateTwo = new Person(180, "Gary", 7, "Software Engineer",18);
		Person candidateThree = new Person(190, "Steve", 8.5, "Software Engineer",25);
		Person candidateFour = new Person(170, "Bill", 9, "Software Engineer",30);
	
		candidateOne.nextCandidate();
		candidateOne.candidateEligibility();
		candidateTwo.nextCandidate();
		candidateTwo.candidateEligibility();
		candidateThree.nextCandidate();
		candidateThree.candidateEligibility();
		candidateFour.nextCandidate();
		candidateFour.candidateEligibility();
	
		
	
	}

	
}
