package com.qa.helloworld;

public class ArrayOneForEach {
	
public static int[] nums = new int[10];
	
	
	public static void main(String[] args) {
		nums[0] = 20;
		nums[1] = 40;
		nums[2] = 60;
		nums[3] = 80;
		for(int i : nums) {
			arrayWun(i);
		}
			
		}
		
		

	public static void arrayWun(int num) {
		System.out.println(num);	
	}

}
