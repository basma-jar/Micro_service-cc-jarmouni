package com.microserviceTP.client;

import com.microserviceTP.client.entities.Client;
import com.microserviceTP.client.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}


	@Bean
	CommandLineRunner initializeMysqlDatabase(ClientRepository clientRepository){
		return args -> {
			clientRepository.save(new Client(Long.parseLong("1"),"Basma",Float.parseFloat("24")));
			clientRepository.save(new Client(Long.parseLong("2"),"Jarmouni",Float.parseFloat("25")));

		};
	}
}
