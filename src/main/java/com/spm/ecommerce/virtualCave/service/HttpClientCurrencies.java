package com.spm.ecommerce.virtualCave.service;


import com.spm.ecommerce.virtualCave.persistence.entitys.Currency;

import com.spm.ecommerce.virtualCave.persistence.entitys.Rate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HttpClientCurrencies {

    public void getCurrency(Rate rate){

        String URL_EMPLOYEES = "http://localhost:3000/currencies"+rate.getCurrencyCode();

        RestTemplate restTemplate = new RestTemplate();

        // Send request with GET method and default Headers.
        Currency currency = restTemplate.getForObject(URL_EMPLOYEES, Currency.class);

        }
    }





