package com.qa.helloworld;

public class IterationFlowFive {
	public static void main(String[] args) {
		flowFive();
	}
	public static void flowFive() {
		for (int i = 1; 10>=i; i++) {
			int multTime = i;
			for (int t = 0;t < multTime;t++ ) {
				System.out.println(i);
			}
		}
	}
}

