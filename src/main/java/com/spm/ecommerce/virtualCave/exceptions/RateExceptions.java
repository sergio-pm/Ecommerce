package com.spm.ecommerce.virtualCave.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
public class RateExceptions extends RuntimeException{

    private String message;
    private HttpStatus httpStatus;

    public RateExceptions(String message,HttpStatus httpStatus){
        super(message);

        this.message=message;
        this.httpStatus=httpStatus;

    }
}
