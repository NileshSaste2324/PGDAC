package com.nilesh.service;

import java.util.List;

import com.nilesh.dao.ProductDao;
import com.nilesh.dao.ProductDaoImpl;
import com.nilesh.entity.Product;

public class ProductServiceImpl implements ProductService{
	

	private ProductDao productDao;
	public ProductServiceImpl() {
		productDao = new ProductDaoImpl();
	}
	@Override
	public void add(Product product) {
		productDao.save(product);
		
	}
	@Override
	public List<Product> getAll() {
		
		return  productDao.selectAll();
	}
}
