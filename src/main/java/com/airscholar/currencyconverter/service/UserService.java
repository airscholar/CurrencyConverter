package com.airscholar.currencyconverter.service;

import com.airscholar.currencyconverter.model.User;
import com.airscholar.currencyconverter.web.dto.UserRegistrationDTO;

public interface UserService {

	User save(UserRegistrationDTO registrationDTO);
	
}
