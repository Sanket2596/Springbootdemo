package com.springbootpro.digimart.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Product {
	private int pid;
	private String pname;
	private int pprice;
	
	@Autowired
	private Category procat;
	public Category getCategory() {
		return procat;
		
	}
	private int pquant;
	public int getPquant() {
		return pquant;
	}
	public void setPquant(int pquant) {
		this.pquant = pquant;
	}
	public int getPprice() {
		return pprice;
	}
	public Product() 
	{
		super();
		System.out.println("Product is added...");
		
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
		System.out.println("Product price is:" + pprice);
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}

}
