package exec;

import concepts.MyFinal;

public class FinalConceptDemo {

	public static void main(String[] args) {
		MyFinal mf = new MyFinal();
		
		System.out.println(mf.x);
		
		//try changing the value of x, it will not compile
		//mf.x = 20;

	}

}
