package com.wisesoft.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RangeTest {

	@Test
	void startWithInclude() {
		MyRange range = new MyRange("[1,5]");
		assertTrue(range.startWithInclude());
	}
	
	@Test
	void startWithExclude() {
		MyRange range = new MyRange("(1,5]");
		assertFalse(range.startWithInclude());
	}
	
	@Test
	void endtWithInclude() {
		MyRange range = new MyRange("[1,5]");
		assertTrue(range.endWithInclude());
	}
	
	@Test
	void endtWithExclude() {
		MyRange range = new MyRange("[1,5)");
		assertFalse(range.endWithInclude());
	}
	
	@Test
	void getStartNumberWithInclude() {
		MyRange range = new MyRange("[1,5]");
		assertEquals(1, range.getStartNumber());
	}
	
	@Test
	void getStartNumberWithExclude() {
		MyRange range = new MyRange("(1,5]");
		assertEquals(2, range.getStartNumber());
	}
	
	@Test
	void getEndNumberWithInclude() {
		MyRange range = new MyRange("[1,5]");
		assertEquals(5, range.getEndNumber());
	}
	
	@Test
	void getEndNumberWithExclude() {
		MyRange range = new MyRange("[1,5)");
		assertEquals(4, range.getEndNumber());
	}
	
	@Test
	void getResulat() {
		MyRange range = new MyRange("[1,5]");
		assertEquals("1,2,3,4,5", range.getResulat());
	}

}
