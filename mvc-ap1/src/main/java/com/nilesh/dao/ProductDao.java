package com.nilesh.dao;

import java.util.List;

import com.nilesh.entity.Product;

public interface ProductDao {
	void save(Product product);
	
	

	List<Product> selectAll();
}
