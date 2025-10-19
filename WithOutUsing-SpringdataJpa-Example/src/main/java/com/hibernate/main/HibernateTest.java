package com.hibernate.main;

import com.hibernate.dao.ProductDao;
import com.hibernate.entity.Product;

public class HibernateTest {
	public static void main(String[] args) {
		ProductDao productDao = new ProductDao();

		Product p1 = new Product(1, "apple", 85000);
		Product p2 = new Product(1, "apple", 85000);
		Product p3 = new Product(1, "apple", 85000);
		Product p4 = new Product(1, "apple", 85000);
		Product p5 = new Product(1, "apple", 85000);

		productDao.saveParoduct(p1);
		productDao.saveParoduct(p2);
		productDao.saveParoduct(p3);
		productDao.saveParoduct(p4);
		productDao.saveParoduct(p5);

	}

}
