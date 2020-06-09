package com.springbootpro.digimart.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int cid;
	private String cname;
	private String caddress;
	 
	@Autowired
	 private Product cproduct;
	 public Product getProductdetails() {
		 return cproduct;
	 }
	 public Customer() {
		 super();
		 System.out.println("Customer is initialized...");
	 }
	 @Autowired
	 private Cart ccart;
	 public Cart getCustCart() {
		 return ccart;
	 }
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	
	 

}
