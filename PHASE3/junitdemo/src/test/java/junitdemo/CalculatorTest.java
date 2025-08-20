package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator cal = new Calculator();

		int input1 = 11;
		int input2 = 25;

		int expectedResult = 36;

		int actualResult = cal.add(input1, input2);

		assertEquals(expectedResult, actualResult);

	}
	
	@Test
	void testAdd2() {
		Calculator cal = new Calculator();

		int input1 = 11;
		int input2 = -25;

		int expectedResult = -14;

		int actualResult = cal.add(input1, input2);

		assertEquals(expectedResult, actualResult);
	}

}
