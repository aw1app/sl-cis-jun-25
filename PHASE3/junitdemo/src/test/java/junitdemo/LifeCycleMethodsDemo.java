package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifeCycleMethodsDemo {
	Calculator cal;
	
	@BeforeEach
	void myBeforeEach() {
		System.out.println("INSIDE myBeforeEach");
		 cal = new Calculator();
	}
	
	@Test
	void testAdd1() {
		System.out.println("INSIDE testAdd1 ");	

		int input1 = 11;
		int input2 = 25;

		int expectedResult = 36;

		int actualResult = cal.add(input1, input2);

		assertEquals(expectedResult, actualResult);

	}
	
	@Test
	void testAdd2() {
		System.out.println("INSIDE testAdd2 ");
		
		int input1 = 11;
		int input2 = -25;

		int expectedResult = -14;

		int actualResult = cal.add(input1, input2);

		assertEquals(expectedResult, actualResult);
	}

}
