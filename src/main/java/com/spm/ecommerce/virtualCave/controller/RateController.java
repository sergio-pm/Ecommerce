package com.spm.ecommerce.virtualCave.controller;

import com.spm.ecommerce.virtualCave.persistence.entities.Rate;
import com.spm.ecommerce.virtualCave.service.RateService;
import com.spm.ecommerce.virtualCave.service.dto.RateInDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/rates")


public class RateController {
    private final RateService rateService;

    public RateController(RateService rateService) {

        this.rateService = rateService;
    }

    @PostMapping
    public Rate createRate(@RequestBody RateInDto rateInDto){

        return  this.rateService.createRate(rateInDto);
    }

    @GetMapping("/byId/{id}")
    public List<Rate> getRate(@PathVariable("id") Long id){

        return this.rateService.getRate(id);
    }

    @PatchMapping("/updatePrice/{id}/{price}")
    public ResponseEntity<Void> updatePrice(@PathVariable("id") Long id , @PathVariable("price") int price) {
        this.rateService.updateRatePrice(id, price);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        this.rateService.deleteRate(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/byDate/{date}")
    public List<Rate> get(@PathVariable("fecha") String fecha, int brandId, int productId){

        return this.rateService.getRateByDate(fecha,brandId,productId);
    }






}
