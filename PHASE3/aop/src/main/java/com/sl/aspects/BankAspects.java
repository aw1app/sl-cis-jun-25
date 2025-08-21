package com.sl.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BankAspects {

	@Before("execution(* com.sl.BankAccount.*(..))")
	public void m1() {

		System.out.println("m1 (LOG) Hi, this is an Before type INTERCEPTOR/ADVICE ");
	}

	// for any class and any method inside com.sl package
	@After("execution(* com.sl.*.*(..))")
	public void m2() {

		System.out.println("m2 (LOG) Hi, this is an After type INTERCEPTOR/ADVICE ");
	}

	// for any class and any method inside com.sl package
	@After("execution(* com.sl.BankAccount.deposit(..))")
	public void m3() {

		System.out.println("m3 (LOG) Hi, this is an After type INTERCEPTOR/ADVICE ");
	}
	
	// TRY these:
	// Task : Create a Around aspect
	// Task : Create Throws aspect
	
	@AfterReturning(pointcut = "execution(* com.sl.BankAccount.withdraw(..))", returning = "result")
	public void m3(double result) {

		if (result >= 5000)
			System.out.println("m4 (LOG) Hi, this is an After Returtning type INTERCEPTOR/ADVICE " + " Amount " + result
					+ " was withdrawn!");
	}
	
	
	
	

}
