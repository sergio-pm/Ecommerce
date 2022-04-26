package com.spm.ecommerce.virtualCave.persistence.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "currency")
@Data
@Entity
public class Currency {

    @Id
    private String code;
    private String symbol;
    private double decimals;
}
