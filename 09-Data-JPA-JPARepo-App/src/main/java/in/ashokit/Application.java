package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.ashokit.Repo.EmployeeRepository;
import in.ashokit.entity.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeRepository repo = context.getBean(EmployeeRepository.class);
		/* =====>    Sorting using spring-data-jpa ..................
		 * Sort sort = Sort.by("empName","empSalary");
		 
		List<Employee> emp = repo.findAll(sort);
		emp.forEach(System.out::println);*/
		/*
		 * ======>     pagination using spring-data-jpa............
         int pageNo =2;
         PageRequest page = PageRequest.of(pageNo-1, 5);
         Page<Employee> findAll = repo.findAll(page);
         List<Employee> emp = findAll.getContent();
         emp.forEach(System.out::println);*/
		// ===>  using Query by Example to filter the table ............
		Employee emp = new Employee();
		emp.setGender("Female");
		emp.setNationality("Indian");
		Example<Employee> ex = Example.of(emp);
		List<Employee> emps = repo.findAll(ex);
		emps.forEach(System.out::println);
	}

}
