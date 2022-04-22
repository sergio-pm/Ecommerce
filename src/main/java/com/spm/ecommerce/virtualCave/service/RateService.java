package com.spm.ecommerce.virtualCave.service;

import com.spm.ecommerce.virtualCave.persistence.entitys.Rate;
import com.spm.ecommerce.virtualCave.persistence.repository.RateRepository;
import org.springframework.stereotype.Service;

@Service
public class RateService {

    private final RateRepository repository;

    public RateService(RateRepository repository) {
        this.repository = repository;
    }

    public Rate createRate(Rate rate){



    }
}
