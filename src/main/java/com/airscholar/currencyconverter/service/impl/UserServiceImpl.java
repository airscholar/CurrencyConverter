package com.airscholar.currencyconverter.service.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.airscholar.currencyconverter.model.Role;
import com.airscholar.currencyconverter.model.User;
import com.airscholar.currencyconverter.repository.UserRepository;
import com.airscholar.currencyconverter.service.UserService;
import com.airscholar.currencyconverter.web.dto.UserRegistrationDTO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User save(UserRegistrationDTO registrationDTO) {

		User user = new User(registrationDTO.getFirstName(), registrationDTO.getLastName(), registrationDTO.getEmail(),
				registrationDTO.getDateOfBirth(), registrationDTO.getPostalAddress(), registrationDTO.getCountry(), registrationDTO.getCity(), passwordEncoder.encode(registrationDTO.getPassword()), Arrays.asList(new Role("ROLE_USER")));

		return userRepository.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(username);

		if (user == null) {
			throw new UsernameNotFoundException("Invalid Username or Password");
		}

		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
				mapRolesToAuthorities(user.getRoles()));
	}

	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}
}
