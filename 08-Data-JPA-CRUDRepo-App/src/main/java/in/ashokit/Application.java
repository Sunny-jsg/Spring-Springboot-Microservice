package in.ashokit;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		BookRepository repo = ctxt.getBean(BookRepository.class);
		
		repo.deleteById(107);
	}

}
