package com.spm.ecommerce.virtualCave.mapper;

import com.spm.ecommerce.virtualCave.persistence.entitys.Rate;
import com.spm.ecommerce.virtualCave.service.dto.RateInDto;
import org.springframework.stereotype.Component;


@Component
public class RateInDtoToRate implements IMapper<RateInDto, Rate> {
    @Override
    public Rate map(RateInDto in) {
        Rate rate =new Rate();
        rate.setBrandId(in.getBrandId());
        rate.setProductId(in.getProductId());
        rate.setStartDate(in.getStartDate());
        rate.setEndDate(in.getEndDate());
        rate.setPrice(in.getPrice());
        rate.setCurrencyCode(in.getCurrencyCode());
        return rate;
    }
}
