package in.ashokit;

public class App {

	public static void main(String[] args) {
		IPayment p = new DebitCardPayment();
		PaymentService service =new PaymentService(p);
		service.doPayment(1200.00);

	}

}
