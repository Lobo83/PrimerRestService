package org.lobo.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableWebMvc
public class PrimerRestService extends WebMvcConfigurerAdapter {

	  //equivalente a usar @Configuration @EnableAutoConfiguration @ComponentScan
	public static void main(String[] args){
		SpringApplication.run(PrimerRestService.class, args);
	}
	@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/*").
        allowedOrigins("http://localhost:4200").
        allowedMethods("GET").
        allowedHeaders("Content-Type","Access-Control-Allow-Origin");
    }
}
