package com.restaurant.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.restaurant.service.CustomerService;

@Controller
public class HomeController {
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/restaurant")
	public String home(Model model) {
		model.addAttribute("customers", customerService.getAllCustomers());
		return "index";
	}
	
	

}
