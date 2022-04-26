package com.spm.ecommerce.virtualCave;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EcommerceVirtualCaveApplication {
	private static final Logger LOGGER= LoggerFactory.getLogger(EcommerceVirtualCaveApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(EcommerceVirtualCaveApplication.class, args);
/*
		String URL_EMPLOYEES = "http://localhost:3000/currencies?code=USD";

		RestTemplate restTemplate = new RestTemplate();

		// Send request with GET method and default Headers.
		String result = restTemplate.getForObject(URL_EMPLOYEES, String.class);
		LOGGER.info(result);*/
	}

}
