package com.qa.helloworld;

public class FlowChart {
	
	public static void main (String[] args) {
		System.out.println(threeInts(10, 10, false)); 
		
	}
	
	public static int threeInts(int num1, int num2, boolean bool) {
		int num3 = 0;
		if (bool==true) {
			 num3 =  num1 + num2;
		}else if (bool==false) {
			num3 = num1 * num2;
		}
		return num3;

	}

}
