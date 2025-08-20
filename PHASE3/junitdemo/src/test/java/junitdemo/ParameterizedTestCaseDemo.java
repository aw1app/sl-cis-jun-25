package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ParameterizedTestCaseDemo {

	@ParameterizedTest
	@CsvSource(
			{ 
				"1, 1, 2",
				"-2, 3, 1",
				"10, -5, 5",
				"0,0,0",
				"1000000000,1000000000,2000000000",
				/*"5000000000,5000000000,10000000000" this set of values fail the test  */
			}
			)
	void testAdd(int input1, int input2, int expectedResult) {
		Calculator cal = new Calculator();

	
		int actualResult = cal.add(input1, input2);

		assertEquals(expectedResult, actualResult);

	}

}
