package com.example.product.dao;

import java.util.List;

import com.example.product.entity.Product;

public interface ProductDAO {
	
	public List<Product> findAll();
}
