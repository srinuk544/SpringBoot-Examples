package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.ContactsMasterEntity;

public interface ContactsRepository extends JpaRepository<ContactsMasterEntity, Integer> {

	ContactsMasterEntity findByName(String name);

	ContactsMasterEntity findByNumber(Long number);
}
