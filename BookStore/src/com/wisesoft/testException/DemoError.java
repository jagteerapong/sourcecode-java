package com.wisesoft.testException;

import javax.crypto.AEADBadTagException;

public class DemoError {
	
	public static void main(String[] args) {
		DemoError demoErr = new DemoError();
		demoErr.processProactive(0);
		double r = demoErr.processReactive(0);
		System.out.println(r);
	}
	
	double processReactive(int input) {
		try {
			return 10/input;
		} catch (ArithmeticException e) {
			
		} catch (Exception e) {
			
		}
		return -1;
	}

	double processProactive(int input) {
		//Fail fast
		if(input == 0) {
			return -1;
		}
		return 10/input;
	}
}
