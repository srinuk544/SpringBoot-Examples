package com.spring.Service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.model.Product;
import com.spring.repository.ProductRepository;

@Service
public class ProductService {
    
    private final ProductRepository productRepository;
    
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    public Product getById(long id) {
    	return productRepository.getById(id);
    }
}
