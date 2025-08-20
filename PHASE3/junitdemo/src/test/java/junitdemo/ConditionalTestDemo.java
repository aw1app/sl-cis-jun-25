package junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class ConditionalTestDemo {

	@Test
	@EnabledOnOs(value =  {OS.WINDOWS} )
	public void testAddOnWindows() {

		System.out.println("INSIDE testAddOnWindows");

		Calculator cal = new Calculator();

		int x = 2;
		int y = 5;

		assertEquals(7, cal.add(x, y));
	}
	
	@Test
	@EnabledOnOs(value =  {OS.MAC} )
	public void testAddOnMac() {

		System.out.println("INSIDE testAddOnMac");

		Calculator cal = new Calculator();

		int x = 2;
		int y = 5;

		assertEquals(7, cal.add(x, y));
	}
	
	@Test
	@EnabledForJreRange(min =  JRE.JAVA_11, max = JRE.JAVA_21 )
	public void testAddOnJRERange() {

		System.out.println("INSIDE testAddOnJRERange");

		Calculator cal = new Calculator();

		int x = 2;
		int y = 5;

		assertEquals(7, cal.add(x, y));
	}

}
