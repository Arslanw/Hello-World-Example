package com.qa.helloworld;

public class ArrayTwo {
	public static int[] addNum = new int[5];
	public static void main(String[] args) {
		int em = 10;
			for (int i = 0; i < addNum.length;i++) {
					addNum[i] =  i; 
				name(addNum[i]);				
			//System.out.println(addNum[i]);
			}
			System.out.println("New--------");
			for (int j = 0; j < addNum.length; j++) {
				addNum[j] = j *10;
				name(addNum[j]);
			}
		
	}
	
	public static void name(int num) {
		System.out.println(num);
	}
	

}
