package com.airscholar.currencyconverter.service.impl;

import java.util.Arrays;
import org.springframework.stereotype.Service;

import com.airscholar.currencyconverter.model.User;
import com.airscholar.currencyconverter.model.Role;
import com.airscholar.currencyconverter.repository.UserRepository;
import com.airscholar.currencyconverter.service.UserService;
import com.airscholar.currencyconverter.web.dto.UserRegistrationDTO;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User save(UserRegistrationDTO registrationDTO) {
		
		User user = new User(registrationDTO.getFirstName(),registrationDTO.getLastName(), registrationDTO.getEmail(),registrationDTO.getPassword(), Arrays.asList(new Role("USER_ROLE")));
		
		return userRepository.save(user); 
	}
}
