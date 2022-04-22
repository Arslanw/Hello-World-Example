package com.qa.helloworld;

public class IterationsFlowOne {
	
	public static void main(String[] args) {
		flowOne();
	}
	
	public static void flowOne() {
		int a = 100;
		boolean bool = true;
		while (bool) {
			System.out.println(a);
			a++;
			if(a > 200) {
				bool = false;
			}
		}
		
		System.out.println("Game over 200");
	}

}
