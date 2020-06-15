package com.example.DigiShop.service;

import com.example.DigiShop.model.Product;
import java.util.List;
public interface ProductService {
Product findProduct(int pid);
boolean deleteProduct(int pid);
boolean updateProduct(Product product);
boolean addProduct(Product product);
List<Product> findAllProducts();

}
