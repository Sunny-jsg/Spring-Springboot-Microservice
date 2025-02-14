package in.ashokit;

public class SodexoPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Sodexo Payment Processed...");
		return true;
	}

}
