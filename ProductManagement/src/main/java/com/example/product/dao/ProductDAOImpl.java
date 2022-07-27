package com.example.product.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.product.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	EntityManager entityManager;

	@Override
	public List<Product> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Product> query = currentSession.createQuery("select p from Product p", Product.class);
		List<Product> productList = query.getResultList(); 
		return productList;
	}
}
