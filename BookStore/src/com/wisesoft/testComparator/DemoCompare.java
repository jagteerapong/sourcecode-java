package com.wisesoft.testComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoCompare {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1,"A",100));
		employees.add(new Employee(2,"B",500));
		employees.add(new Employee(3,"C",600));
		employees.forEach(System.out::println);
		
		
	}
}

class Employee{
	private int id;
	private String name;
	private double saraly;
	
	public Employee(int id, String name, double saraly) {
		this.id = id;
		this.name = name;
		this.saraly = saraly;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaraly() {
		return saraly;
	}

	public void setSaraly(double saraly) {
		this.saraly = saraly;
	}
	
}