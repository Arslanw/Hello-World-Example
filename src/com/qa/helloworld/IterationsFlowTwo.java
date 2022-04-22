package com.qa.helloworld;

public class IterationsFlowTwo {
	public static void main(String[] args) {
		flowTwo();
	}
	
	public static void flowTwo() {
		for (int a = 100; 200 > a ; a++) {
			
			if (a % 2 ==0) {
				System.out.println("-");
				//a++;
				
				
			}
			else{
				System.out.println("*");
				//a++;
				
			}
			
		}
	}
}
