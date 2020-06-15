package com.example.DigiShop.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import com.example.DigiShop.service.ProductService;

@Controller
public class ProSpringController {

	@Qualifier("ps1")
	@Autowired
	private ProductService prodetails;
	public ProSpringController() {
		System.out.println("Product details created successfully!!");
	}
	@RequestMapping("/aproducts")
	public ModelAndView getAllProducts() {
		return new ModelAndView
	}
	
	
	
}
