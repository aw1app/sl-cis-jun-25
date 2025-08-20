package junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifeCycleMethodsDemo {
	Calculator cal;
	
	@BeforeAll
	static void myBeforeAll() {
		System.out.println(" INSIDE myBeforeAll. This method will run before starting the test cases in this class  ");
	}
	
	@AfterAll
	static void myAfterAll() {
		System.out.println(" INSIDE myAfterAll. This method will run after all test cases completed in this class  ");
	}
	
	@BeforeEach
	void myBeforeEach() {
		System.out.println("\t INSIDE myBeforeEach");
		 cal = new Calculator();
	}
	
	@AfterEach
	void myAfterEach() {
		System.out.println("\t INSIDE myAfterEach \n");
		 cal = null;
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
