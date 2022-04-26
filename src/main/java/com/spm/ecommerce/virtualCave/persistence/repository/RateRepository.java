package com.spm.ecommerce.virtualCave.persistence.repository;

import com.spm.ecommerce.virtualCave.persistence.entities.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RateRepository extends JpaRepository<Rate, Long> {

    public List<Rate> findAllById(Long id);

    @Modifying
    @Query(value="Update t_rates set price=:price where id=:id", nativeQuery = true)
    public void updateRatePrice(@Param("id") Long id, @Param("price") int price);


    @Query(value="SELECT * FROM t_rates WHERE START_DATE=:fecha AND PRODUCT_ID =:id_product AND BRAND_ID=:id_brand",nativeQuery = true)
    public List<Rate> getRateByDate(@Param("fecha") String fecha, @Param("id_brand") int id_brand, @Param("id_product") int product);
}
