package com.teste.apipedidos.apipedido;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.filter.OAuth2ClientContextFilter;

@SpringBootApplication
@EnableEurekaClient
public class ApipedidoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApipedidoApplication.class, args);
	}


}
