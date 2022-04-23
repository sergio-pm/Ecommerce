package com.spm.ecommerce.virtualCave.persistence.repository;

import com.spm.ecommerce.virtualCave.persistence.entitys.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RateRepository extends JpaRepository<Rate, Long> {

    public List<Rate> findAllById(Long id);

    @Modifying
    @Query(value="Update t_rates set price=:price where id=:id", nativeQuery = true)
    public void updateRatePrice(@Param("id") Long id, @Param("price") int price);
}
