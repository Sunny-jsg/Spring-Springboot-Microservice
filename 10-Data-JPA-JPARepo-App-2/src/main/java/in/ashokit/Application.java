package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Student;
import in.ashokit.repo.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt =
				SpringApplication.run(Application.class, args);
		StudentRepository repo = ctxt.getBean(StudentRepository.class);
		Student stu = new Student();
		//stu.setSid(101);
		stu.setSname("Ram");
		stu.setMarks(499.00);
		stu.setSection('A');
		repo.save(stu);
		System.out.println("record inserted....");
	}

}
