package com.spm.ecommerce.virtualCave.service;

import com.spm.ecommerce.virtualCave.mapper.RateInDtoToRate;
import com.spm.ecommerce.virtualCave.persistence.entitys.Rate;
import com.spm.ecommerce.virtualCave.persistence.repository.RateRepository;
import com.spm.ecommerce.virtualCave.service.dto.RateInDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RateService {

    private final RateRepository repository;
    private final RateInDtoToRate mapper;

    public RateService(RateRepository repository, RateInDtoToRate mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Rate createRate(RateInDto rateInDto){
        Rate rate =mapper.map(rateInDto);
        return this.repository.save(rate);
    }

    @Transactional(readOnly = true)
    public List<Rate> getRate(Long id) {
        return repository.findAllById(id);
    }
    @Transactional
    public void updateRatePrice(Long id,int price){
        this.repository.updateRatePrice(id,price);
    }

}

