
package in.ashokit;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmt) {
		//logic
		System.out.println("CreditCard Payment Sucess...");
		return true;
	}

}
