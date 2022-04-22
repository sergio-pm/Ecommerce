package com.spm.ecommerce.virtualCave.mapper;

import com.spm.ecommerce.virtualCave.persistence.entitys.Rate;
import com.spm.ecommerce.virtualCave.service.dto.RateInDto;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class RateInDtoToRate implements IMapper<RateInDto, Rate> {
    @Override
    public Rate map(RateInDto in) {
        Rate rate =new Rate();
        rate.setBrandId(in.getBrandId());


      brandId;
        productId;
        startDate;
        endDate;
        price;
        currencyCode;
        return null;
    }
}
