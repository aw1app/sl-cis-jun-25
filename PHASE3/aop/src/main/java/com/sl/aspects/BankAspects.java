package com.sl.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BankAspects {
	
	
	@Before("execution(* com.sl.BankAccount.*(..))")
	public void m1() {

		System.out.println(" (LOG) Hi, this is an Before type INTERCEPTOR/ADVICE ");

	}

}
