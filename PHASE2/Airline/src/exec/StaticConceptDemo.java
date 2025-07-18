package exec;

import concepts.MyStatic;

public class StaticConceptDemo {

	public static void main(String[] args) {
		MyStatic ms1 = new MyStatic();
		MyStatic ms2 = new MyStatic();
		
		System.out.println("ms1.x="+ ms1.x);
		System.out.println("ms2.x="+ ms2.x);
		
		ms1.x = 25;
		System.out.println("\nAfter  ms1.x = 25");
		
		System.out.println("ms1.x="+ ms1.x);
		System.out.println("ms2.x="+ ms2.x);
		
		//you can also access static variables directly using the class itself!
		System.out.println("you can also access static variables directly using the class itself!");
		System.out.println("\n MyStatic.x="+ MyStatic.x);

	}

}
