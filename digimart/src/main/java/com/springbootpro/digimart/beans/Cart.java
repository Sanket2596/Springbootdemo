package com.springbootpro.digimart.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cart {
	int[] items = new int[10];
	
	@Autowired
	private Customer citems;
	public Cart() {
		super();
		System.out.println("Cart Initialized..");
	}
  public Customer getCust() {
	  return citems;
  }
}
