package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.entity.ContactsMasterEntity;
import com.spring.repository.ContactsRepository;

@Service
public class ContactsService {

	private final ContactsRepository contactsRepository;

	public ContactsService(ContactsRepository contactsRepository) {
		this.contactsRepository = contactsRepository;
	}

	public ContactsMasterEntity saveContact(ContactsMasterEntity contact) {
		return contactsRepository.save(contact);
	}

	public List<ContactsMasterEntity> getAllContacts() {
		return contactsRepository.findAll();
	}

	public Optional<ContactsMasterEntity> getContactById(Integer id) {
		return contactsRepository.findById(id);
	}

	public void deleteContact(Integer id) {
		contactsRepository.deleteById(id);
	}

	public ContactsMasterEntity getContactByName(String name) {
		return contactsRepository.findByName(name);
	}
}