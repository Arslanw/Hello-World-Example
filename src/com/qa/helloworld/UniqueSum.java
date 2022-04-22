package com.qa.helloworld;

//---Accidentally did UniqueSum task in BlackJack class----
public class UniqueSum {
	public static void main(String[] args) {
		System.out.println(greaterThan(21, 10));
	}
	
	public static int greaterThan(int num1,int num2) {
		int num3 = 0;
		if(num1>21) {
			num1=0;
		}
		if(num2>21) {
			num2=0;
		}
		if(num1 > 21 && num2> 21) {
			num3 = 0;
		}
		if(21-num1 > 21-num2) {
			num3 = num2;
			
		}
		if(21-num1 < 21-num2) {
			num3 = num1;
			
		}
		return num3;
	}
}
