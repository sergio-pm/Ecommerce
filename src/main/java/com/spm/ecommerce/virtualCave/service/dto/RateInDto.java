package com.spm.ecommerce.virtualCave.service.dto;

import java.time.LocalDateTime;

public class RateInDto {

    private Long brandId;
    private Long productId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int price;
    private String currencyCode;
}
