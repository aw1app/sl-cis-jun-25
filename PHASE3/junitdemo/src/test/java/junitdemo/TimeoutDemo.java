package junitdemo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class TimeoutDemo {

	@Test
	@Timeout(value =1, unit = TimeUnit.NANOSECONDS)
	void testAdd1() {
		int a = 4;
		int b = 0;
		
		assertTrue(a > b); // failed 
	}
	
	@Test
	@Timeout(value =1, unit = TimeUnit.MICROSECONDS)
	void testAdd2() {
		int a = 4;
		int b = 0;
		
		assertTrue(a > b); // fail 
	}
	
	@Test
	@Timeout(value =1, unit = TimeUnit.MILLISECONDS)
	void testAdd3() {
		int a = 4;
		int b = 0;
		
		assertTrue(a > b); // fail 
	}

}
