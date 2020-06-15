package com.example.DigiShop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Entity
@Table(name="product_details")
@Component
public class Product {
	@Id
	@Column(name="ID")
	private int pid;
	private String pname;
	private int pquant;
	private int pprice;
	public int getPid() {
		return pid;
	}
	@Autowired
	private Category procat;
	public Category getCategory() {
		return procat;
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
	public int getPquant() {
		return pquant;
	}
	public void setPquant(int pquant) {
		this.pquant = pquant;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pquant=" + pquant + ", pprice=" + pprice + "]";
	}
	public Product() {
		super();
		System.out.println("Product added successfully...");
	}

}
