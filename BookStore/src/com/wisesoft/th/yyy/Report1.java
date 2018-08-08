package com.wisesoft.th.yyy;

public class Report1 extends Report{

	@Override
	void createHeader() {
		System.out.println("HEADER");
	}

	@Override
	void createBody() {
		System.out.println("BODY");
	}

	@Override
	void createFooter() {
		System.out.println("FOOTER");
	}
	
	public void printName(String name) {
		System.out.println(name);
	}
	
}
