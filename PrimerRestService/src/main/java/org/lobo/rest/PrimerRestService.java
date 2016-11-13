package org.lobo.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimerRestService {

	  //equivalente a usar @Configuration @EnableAutoConfiguration @ComponentScan
	public static void main(String[] args){
		SpringApplication.run(PrimerRestService.class, args);
	}
}
