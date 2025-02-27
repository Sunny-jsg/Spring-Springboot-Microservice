package in.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import in.ashokit.AppConfig;
import in.ashokit.beans.ReportService;
@Component
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ReportService service = context.getBean(ReportService.class);
		service.generateReport();
	}

}
