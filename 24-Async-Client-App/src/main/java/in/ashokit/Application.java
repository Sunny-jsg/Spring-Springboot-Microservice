package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.Disposable;

@SpringBootApplication
public class Application {
	static String url = "http://13.232.253.164:8080/ticket/{ticketNum}";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		WebClient webClient = WebClient.create();
		System.out.println("request sending started.......");
		webClient.get().uri(url, 2).retrieve().bodyToMono(String.class).subscribe(Application::handleResponse);
		System.out.println("request sending ended.....");
	}

	public static void handleResponse(String response) {
		System.out.println(response);
	}

}
