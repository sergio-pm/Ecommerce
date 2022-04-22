package com.spm.ecommerce.virtualCave.persistence.repository;

import com.spm.ecommerce.virtualCave.persistence.entitys.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RateRepository extends JpaRepository<Rate, Long> {
}
