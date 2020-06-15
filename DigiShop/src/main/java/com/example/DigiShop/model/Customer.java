package com.example.DigiShop.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int cid;
	private String cname;
	private int cno;
	private String cadd;
	public int getCid() {
		return cid;
	}
	@Autowired
	private Product cproduct;
	public Product getProductdetails() {
		return cproduct;
	}
	@Autowired
	private Cart ccart;
	public Cart getCartDetails() {
		return ccart;
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
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public Customer () {
		super();
		System.out.println("Customer initialized...");
	}

}
