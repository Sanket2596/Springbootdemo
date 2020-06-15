package com.example.DigiShop.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cart {
	private int citems;
	@Autowired
	private Customer custitems;
	public Customer getItems() {
		return custitems;
	}
	public int getCitems() {
		return citems;
	}
	public void setCitems(int citems) {
		this.citems = citems;
	}
	public Customer getCustitems() {
		return custitems;
	}
	public void setCustitems(Customer custitems) {
		this.custitems = custitems;
	}
	public Cart() {
		super();
		System.out.println("Items in the cart initialized...");
	}
}
