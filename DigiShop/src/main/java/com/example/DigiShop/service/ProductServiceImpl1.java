package com.example.DigiShop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DigiShop.Repository.ProductRepository;
import com.example.DigiShop.model.Product;
@Service("ps1")
public class ProductServiceImpl1 implements ProductService {

	@Override
	public Product findProduct(int pid) {
		// TODO Auto-generated method stub
		return (Product) myrepository.findById(pid).get();
	}

	@Override
	public boolean deleteProduct(int pid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		Product p =(Product) myrepository.findById(product.getPid()).get();
		if (p!=null) {
			myrepository.save(product);
		return true;
	}
return false;
	}
	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}
	@Autowired
	private ProductRepository myrepository;
	public ProductServiceImpl1() {
		System.out.println("Product Impl1 Service created successfully!!!");
	}

	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		return myrepository.save(product) == product;
	}

}
