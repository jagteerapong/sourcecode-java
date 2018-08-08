package com.wisesoft.testInterface;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class RandomNumberTest {

	@Test
	void test() {
		Random random = new Random5();
		RandomNumber randomNumber = new RandomNumber();
		assertEquals(5, randomNumber.generate(random));
	}

}

//Override by method
class Random5 extends Random {
	@Override
	public int nextInt(int bound) {
		return 5;
	}
}




//Override by method
//package com.wisesoft.testInterface;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.Random;
//
//import org.junit.jupiter.api.Test;
//
//class RandomNumberTest {
//
//	@Test
//	void test() {
//		Random random = new Random5();
//		RandomNumber randomNumber = new RandomNumber();
//		assertEquals(5, randomNumber.generate(random));
//	}
//
//}
//
////Override by method
//class Random5 extends Random {
//	@Override
//	public int nextInt(int bound) {
//		return 5;
//	}
//}




//aunonymous class
//package com.wisesoft.testInterface;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.Random;
//
//import org.junit.jupiter.api.Test;
//
//class RandomNumberTest {
//
//	@Test
//	void test() {
//		Random random = new Random() {
//			@Override
//			public int nextInt( int arg0) {
//				return 5;
//			}
//		};
//		RandomNumber randomNumber = new RandomNumber();
//		assertEquals(5, randomNumber.generate(random));
//	}
//
//}
