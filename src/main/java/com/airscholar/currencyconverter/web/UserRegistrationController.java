package com.airscholar.currencyconverter.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.airscholar.currencyconverter.service.UserService;
import com.airscholar.currencyconverter.web.dto.UserRegistrationDTO;

@Controller
@RequestMapping("registration")
public class UserRegistrationController {

	private UserService userService;
	private RestTemplate restTemplate = new RestTemplate();
	private static String COUNTRIES_URL = "https://restcountries.eu/rest/v2/all";

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}

	@ModelAttribute("user")
	public UserRegistrationDTO userRegistrationDTO() {
		return new UserRegistrationDTO();
	}

	@GetMapping
	public String showRegistrationForm(Model model) {
//		Object[] countries = restTemplate.getForObject(COUNTRIES_URL, Object[].class);
//		model.addAttribute("countries", countries);

		return "registration";
	}

	@PostMapping
	public String registerUserAccount(@Valid @ModelAttribute("user") UserRegistrationDTO registrationDTO,
			BindingResult bindingResult) {

//		if (bindingResult.hasErrors()) {
//			return "redirect:/registration?failure";
//		} else {
		userService.save(registrationDTO);
//		}

		return "redirect:/registration?success";
	}
}
