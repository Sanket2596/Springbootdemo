package com.example.DigiShop.model;

import org.springframework.stereotype.Component;

@Component
public class Category {
private String laptop;
private String mobile;
public String getLaptop() {
	return laptop;
}
public void setLaptop(String laptop) {
	this.laptop = laptop;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
}
