package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
		PaymentService service = ctxt.getBean(PaymentService.class);
		service.doPayment(1200);
	}

}
