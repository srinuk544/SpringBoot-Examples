package com.spring.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.product.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
