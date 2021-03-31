package com.airscholar.currencyconverter.service;


import com.airscholar.currencyconverter.model.Converter;
import com.airscholar.currencyconverter.web.dto.ConverterDTO;

public interface ConverterService {
	
	Converter save(ConverterDTO converterDTO);
	
	Iterable<Converter> findAll();
	
}
