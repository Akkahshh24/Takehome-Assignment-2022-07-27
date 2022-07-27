package com.example.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.dao.ProductDAOImpl;
import com.example.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDAOImpl productDAO;

	@Override
	public List<Product> findAll() {
		return productDAO.findAll();
	}
}
