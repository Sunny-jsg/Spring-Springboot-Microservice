
package in.ashokit;

public class DebitCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("debit Card Payment Processed .....");
		return true;
	}

}
