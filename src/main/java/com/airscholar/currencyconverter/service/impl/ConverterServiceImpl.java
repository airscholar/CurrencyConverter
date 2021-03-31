package com.airscholar.currencyconverter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airscholar.currencyconverter.model.Converter;
import com.airscholar.currencyconverter.repository.ConverterRepository;
import com.airscholar.currencyconverter.service.ConverterService;
import com.airscholar.currencyconverter.web.dto.ConverterDTO;

@Service
public class ConverterServiceImpl implements ConverterService {

	@Autowired
	ConverterRepository converterRepository;

	public ConverterServiceImpl(ConverterRepository converterRepository) {
		super();
		this.converterRepository = converterRepository;
	}

	@Override
	public Converter save(ConverterDTO converterDTO) {
		Converter converter = new Converter(converterDTO.getFromCurrency(), converterDTO.getFromCurrencyValue(),
				converterDTO.getToCurrency(), converterDTO.getToCurrencyValue(), converterDTO.getUserInfo(), converterDTO.getCurrencyDate());

		return converterRepository.save(converter);
	}

	@Override
	public Iterable<Converter> findAll() {
		return converterRepository.findAll();
	}

}
