package seti.microservices.eureka;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication {
	
	static Logger logger = Logger.getLogger(EurekaServiceApplication.class);

	public static void main(String[] args) {
		
		SpringApplication.run(EurekaServiceApplication.class, args);
		logger.info("Microserviço EUREKA do SETI iniciado com sucesso!");
		
	}
}
