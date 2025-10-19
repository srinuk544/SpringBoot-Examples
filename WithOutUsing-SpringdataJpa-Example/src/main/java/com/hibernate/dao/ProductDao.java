package com.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Product;

public class ProductDao {

	private SessionFactory sessionFactory;

	public ProductDao() {
		sessionFactory = new Configuration().configure("Hibernatecfg.xml").addAnnotatedClass(Product.class)
				.buildSessionFactory();
	}

	public void saveParoduct(Product product) {
		Session s = sessionFactory.openSession();
		s.save(product);
		s.getTransaction().commit();
		s.close();
	}

	public Product getProductById(Long id) {
		Session ss = sessionFactory.openSession();
		Product p = ss.get(Product.class, id);
		ss.close();
		return p;

	}

	public void deleteProduct(long id) {

		Session sss = sessionFactory.openSession();
		sss.beginTransaction();
		Product p1 = sss.get(Product.class, id);
		if (p1 != null) {
			sss.delete(p1);

		}
		sss.getTransaction().commit();
		sss.close();
	}
}
