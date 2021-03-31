
package com.airscholar.currencyconverter.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.airscholar.currencyconverter.model.Converter;
import com.airscholar.currencyconverter.web.dto.ConverterDTO;
import com.airscholar.currencyconverter.web.dto.UserRegistrationDTO;

@Controller
public class MainController {

	static RestTemplate restTemplate = new RestTemplate();
	private String EXCHANGE_URL = "https://openexchangerates.org/api/latest.json?app_id=3d78ba2081cf43f297af796dfb1bab35";
	private String CURRENCIES_URL = "https://openexchangerates.org/api/currencies.json?app_id=3d78ba2081cf43f297af796dfb1bab35";


	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/")
	public String index(Model model) {

		// Object data = restTemplate.getForObject(EXCHANGE_URL, Object.class);  
		Object currencies = restTemplate.getForObject(CURRENCIES_URL, Object.class);
		model.addAttribute("currencies", currencies);
//		
		return "index";
	} 
	
	@ModelAttribute("converter")
	public ConverterDTO converterDTO() {
		return new ConverterDTO();
	}

	@PostMapping("/")
	public String CurrencyConverter(@ModelAttribute("converter") Converter converter) {
		return "";
	}
}

