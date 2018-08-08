package com.wisesoft.th.yyy;

public abstract class Report {
	abstract void createHeader();
	abstract void createBody();
	abstract void createFooter();
	
	public void generateReport() {
		createHeader();
		createBody();
		createFooter();
	}
}
