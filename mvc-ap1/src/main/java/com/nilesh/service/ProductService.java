package com.nilesh.service;

import java.util.List;

import com.nilesh.entity.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();
}
