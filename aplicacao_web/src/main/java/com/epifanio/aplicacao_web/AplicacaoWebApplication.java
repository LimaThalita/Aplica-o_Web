package com.epifanio.aplicacao_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class AplicacaoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplicacaoWebApplication.class, args);
	}
		@GetMapping("/thali")
		public String index(){
			return "Olá mundo!";
		}
}
