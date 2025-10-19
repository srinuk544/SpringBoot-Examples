package com.spring.repository;

import com.spring.entities.ContactsMasterEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ContactsRepository extends CrudRepository<ContactsMasterEntity, Integer> {
}
