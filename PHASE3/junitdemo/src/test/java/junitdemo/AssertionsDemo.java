package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertionsDemo {

	@Test
	void test() {
		
		String str = null;
		String str2 = "some value";		
		
		//assertEquals(str, str2); fail
		
		assertSame(str, str); // pass
		assertNotSame(str, str2); // pass
		
		assertNull(str); // pass
		assertNotNull(str2); // pass
		
		int a = 4;
		int b = 0;
		
		assertTrue(a > b); // pass
		
		assertFalse(5 < 1); //pass
		//assertFalse(5 < 11); //fail
		
		
		String[] a1 = { "A", "B" };
		String[] a2 = { "A", "B" };
		
		//assertEquals(a1, a2); // fail because this compares the reference and not actual content 
		
		assertArrayEquals(a1, a2); // pass
		
		// assertThrows(ArithmeticException.class,  () -> { new Calculator().divide(10, 1); } ); // fail		
		assertThrows(ArithmeticException.class,  () -> { new Calculator().divide(10, 0); } ); // pass
		
	}

}
