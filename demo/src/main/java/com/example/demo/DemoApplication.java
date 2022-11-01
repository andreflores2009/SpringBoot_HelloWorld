package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//System.out.println("Hello");		
	}
		
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

}

/* Link: 
  https://spring-io.translate.goog/quickstart?_x_tr_sl=en&_x_tr_tl=pt&_x_tr_hl=pt-BR&_x_tr_pto=sc
 "Hello"no código. Isso significa que, se você definir seu nome “Amy”na solicitação, a resposta será “Hello Amy”.
 
A @RestControlleranotação informa ao Spring que este código descreve um endpoint que deve ser disponibilizado na web. 
O @GetMapping(“/hello”)diz ao Spring para usar nosso hello()método para responder a solicitações que são enviadas para o 
http://localhost:8080/helloendereço. Finalmente, @RequestParamestá dizendo ao Spring para esperar um namevalor na solicitação, 
mas se não estiver lá, ele usará a palavra “World” por padrão.*/