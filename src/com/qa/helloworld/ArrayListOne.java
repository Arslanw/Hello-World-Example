package com.qa.helloworld;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListOne {
	public static void main(String[] args) {
		List<Integer> ages = new ArrayList<>();
		ages.add(21);
		ages.add(22);
		ages.add(23);
		ages.add(24);
		System.out.println(ages);
		for (int i = 0; i < ages.size();i++) {
			System.out.println(ages.get(i));
		}
		System.out.println("FOREACH----");
		for(int i : ages) {
			System.out.println(i);
		}
		System.out.println("Get----");
		System.out.println(ages.get(3));
		System.out.println("Set----");
		ages.set(3, 34);
		System.out.println(ages.get(3));
		System.out.println("remove----");
		ages.remove(3);
		System.out.println(ages);
		System.out.println("Sortt----");
		Collections.sort(ages);
		System.out.println(ages);
		System.out.println("Swap----");
		Collections.swap(ages, 0, 2);
		System.out.println(ages);
		System.out.println("Sreverse----");
		Collections.reverse(ages);
		System.out.println(ages);
		System.out.println("Clear----");
	    ages.clear();
	    System.out.println(ages);
		
	}
	
	

}
