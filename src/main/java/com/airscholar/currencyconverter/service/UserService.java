package com.airscholar.currencyconverter.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.airscholar.currencyconverter.model.User;
import com.airscholar.currencyconverter.web.dto.UserRegistrationDTO;

public interface UserService extends UserDetailsService {

	User save(UserRegistrationDTO registrationDTO);
	
}
