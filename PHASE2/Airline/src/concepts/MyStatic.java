package concepts;

public class MyStatic {

	public static int x = 1; // static variables are also called class properties/variables.

	public int y = 1;// non-static variables are also called instance properties/variables.

	public MyStatic() {

	}

	// a static method
	public static void method1() {
		System.out.println("x = " + x ); //  fine 
		
		// not fine below as y is non static and cannot be accessed from static method.
		//System.out.println("y = " + y ); 
	}

	// a non-static method ( an instance method)
	public void method2() {
		
		System.out.println("x = " + x );
	
		System.out.println("y = " + this.y );
	}

}
