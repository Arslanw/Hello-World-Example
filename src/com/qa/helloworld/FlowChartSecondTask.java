package com.qa.helloworld;

public class FlowChartSecondTask {
	public static void main (String[] args) {
		flowInt(6000); 	
	}
	public static void flowInt(int a) {
		if (a > 2000) {
			System.out.println("A");
			if(a > 6000) {
				System.out.println("C");
			}
			else {
				System.out.println("B");
				
				if(a>4000) {
					System.out.println("D");
				}
				else {
					System.out.println("E");
				}
			}
			
			
			
		}
		else if(a<2000) {
			System.out.println(1);
			if(a>100) {
				System.out.println(3);
				if(a>600) {
					System.out.println(5);
				}
				if(a<600) {
					System.out.println(4);
					if(a>500) {
						System.out.println(6);
					}
					if (a<500) {
						System.out.println(7);
					}
				}
			}
			if(a<100) {
				System.out.println(2);
			}
		}
		
				
	
	}

}
