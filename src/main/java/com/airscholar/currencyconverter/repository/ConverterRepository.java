package com.airscholar.currencyconverter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airscholar.currencyconverter.model.Converter;

@Repository
public interface ConverterRepository extends JpaRepository<Converter, Long> {
		
}
