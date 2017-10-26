package seti.microservices.lecture;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaClient
public class LectureApplication {

	@Value("${value:SETI é o maior e melhor evento do Sul de Minas!!!}")
	public String value;

	@RequestMapping(value = "/available")
	public String available() {
		return "Palestra de Microserviços na SETI está rolando...";
	}

	@RequestMapping(value = "/message")
	public String message() {
		return value;
	}

	public static void main(String[] args) {
		SpringApplication.run(LectureApplication.class, args);
	}
}
