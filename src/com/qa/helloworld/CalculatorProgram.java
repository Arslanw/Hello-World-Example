package com.qa.helloworld;

import java.util.Scanner;

public class CalculatorProgram {
	public static void main(String[] args) {
		System.out.println(multNum(4, 2));
		divNum(1, 3);
		addNum();
		
		
	}

	public static void addNum() {
		int num1, num2, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		num1 = sc.nextInt();

		System.out.println("Enter Second Number: ");
		num2 = sc.nextInt();

		sc.close();
		sum = num1 + num2;
		System.out.println("Sum of these numbers: " + sum);
	}

	public static int multNum(int num1, int num2) {
		return num1 * num2;
	}
	public static void divNum(double num1, double num2) {
		if (num1 < num2) {
		System.out.println(num1 / num2);
		}else {
			System.out.println("This cannot be performed");
		}
	}

}
