package com.wisesoft.day5;

public class MyRange {
	public String input;

	public MyRange(String input) {
		this.input = input;
	}

	public boolean startWithInclude() {
		return this.input.startsWith("[");
	}
	
	public boolean endWithInclude() {
		return this.input.endsWith("]");
	}

	public int getStartNumber() {
		if (startWithInclude()) {
			return input.charAt(1) - 48;
		}
		return input.charAt(1) - 47;
	}

	public int getEndNumber() {
		if (endWithInclude()) {
			return input.charAt(3) - 48;
		}
		return input.charAt(3) - 49;
	}

	public String getResulat() {
		String result = "";
		int start = getStartNumber();
		int end = getEndNumber();
		
		for ( ;start <= end; start++) {
			result+=start+",";
		}
		
		return result.substring(0,result.length()-1);
	}
	
	
	
}
