package in.ashokit.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.UserDAO;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		UserDAO dao = context.getBean(UserDAO.class);
		dao.getData();

		ConfigurableApplicationContext cctxt = (ConfigurableApplicationContext) context;
		cctxt.close();
	}

}
