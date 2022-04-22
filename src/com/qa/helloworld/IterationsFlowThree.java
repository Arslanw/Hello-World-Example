package com.qa.helloworld;

public class IterationsFlowThree {
	public static void main(String[] args) {
		flowThree();
	}
	
	public static void flowThree() {
		int multTime = 10;
		for (int i = 1; 10>=i; i++) {
			for (int t = 0;t < multTime;t++ ) {
				System.out.println(i);
			}
		}
	}
}
