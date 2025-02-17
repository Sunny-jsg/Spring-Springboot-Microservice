

package in.ashokit;

public class DebitCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmt) {
		//logic
		System.out.println("DebitCard Payment Sucess...");
		return true;
	}

}
