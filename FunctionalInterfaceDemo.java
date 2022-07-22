package com.cybersolveit.core.java8.features;

import java.util.ArrayList;
import java.util.List;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// java < 8 version
		new MyFunctionalInterface() {
			@Override
			public void display() {
				System.out.println("I am custom functional interface...");
			}
		};
		
		// java 8 or > 8
		FunctionalInterfaceDemo demo  = new FunctionalInterfaceDemo();
		List<String> names = demo.createFirstNames();
		
		
		// using java 7
		System.out.println("Using advanced for loop ");
		for (String name : names) {
			System.out.println(name);
		}
		// using java 8
		System.out.println("Using lambda expression");
		names.forEach(name -> System.out.println(name));
		
		System.out.println("Using method reference");
		names.forEach(System.out::println);
	}
	

	private List<String> createFirstNames() {
		List<String> firstNames = new ArrayList<>();
		firstNames.add("John");
		firstNames.add("Jane");
		firstNames.add("Christina");

		List<String> firstNames2 = new ArrayList<>();
		firstNames2.add("Dane");
		firstNames2.add("Chris");

		firstNames2.addAll(firstNames);

		return firstNames2;
	}
	

}
