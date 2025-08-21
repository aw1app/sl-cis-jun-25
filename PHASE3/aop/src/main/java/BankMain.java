import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.sl.BankAccount;
import com.sl.X;

@Configuration
@ComponentScan({ "com.sl" })
@EnableAspectJAutoProxy
public class BankMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BankMain.class);

		BankAccount bankAcct = context.getBean(BankAccount.class);

		bankAcct.deposit(100000.0d);

		bankAcct.withdraw(1000.0d);

		double bal = bankAcct.getBalance();
		System.out.println(" Bal is $" + bal);

		X x1 = (X) context.getBean(X.class);

		x1.methodX1();
		
		bankAcct.withdraw(6000.0d);
	}

}
