package in.ashokit.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJacksonConverter {
	public static void main(String[] args) throws Exception {
		Address addr = new Address();
		addr.setCity("Jharsuguda");
		addr.setState("Odisha");
		addr.setCountry("India");

		Customer c = new Customer();
		c.setId(1);
		c.setName("Sunny");
		c.setEmail("Sunny@gmail.com");
		c.setPhno(6370406070L);
		c.setAddress(addr);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), c);
		System.out.println("json file created");
	}
}
