package com.wisesoft.testDB;

import java.util.ArrayList;
import java.util.List;

public class DemoLD {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList<>();
		number.add(2);
		number.add(3);
		number.add(4);
		
		number.forEach(System.out::println);
		System.out.println("***********");
		number.stream().filter(i -> i%2==0).map(i -> i*2).forEach(System.out::println);
		System.out.println("***********");
		number.forEach(System.out::println);
	}

}
