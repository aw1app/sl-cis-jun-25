package junitdemo;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedTestsDemo {

	@Test	
	void test() {
		System.out.println("Inside  test()");
	}

	@Nested
	class GroupA {
		@Test
		void test1a() {
			System.out.println("Inside  test1a()");
		}
		
		@Test	
		void test1b() {
			System.out.println("Inside  test1b()");
		}
	}
	
	@Nested
	class GroupB {
		
		@Test	
		void test2a() {
			System.out.println("Inside  test2a()");
		}
		
		@Test
		void test2b() {
			System.out.println("Inside  test2b()");
		}
	}

}
