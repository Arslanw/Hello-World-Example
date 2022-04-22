package com.qa.helloworld;

//Did Blackjacktask in UniqueSum Class------
public class BlackJack {
	public static void main(String[] args) {
		System.out.println(uniqueNums(3, 3, 3));
		
	}
	
	public static int uniqueNums(int num1, int num2, int num3) {
		if (num1==num2 && num2==num3 && num1 ==num3) {
			num1 = 0;
			num2 = 0;
			num3= 0;
		}
		if (num1==num2) {
			num1 = 0;
			num2 = 0;
		}
		if (num1==num3) {
			num1 = 0;
			num3 = 0;
		}
		if (num2==num3) {
			num3 = 0;
			num2 = 0;
		}
		
		
		return num1 + num2+ num3;
		
	}

}
