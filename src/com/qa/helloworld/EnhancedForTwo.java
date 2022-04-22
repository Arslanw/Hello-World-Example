package com.qa.helloworld;

public class EnhancedForTwo {
	public static int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	public static void main(String[] args) {
		for(int i = 0; i < ints.length;i++) {
			System.out.println(ints[i]);
			
		}
		System.out.println("SQUARE----");
		for (int j : ints) {
			
			 System.out.println((int)Math.pow(ints[j], 2));
		}
	}
	
}
