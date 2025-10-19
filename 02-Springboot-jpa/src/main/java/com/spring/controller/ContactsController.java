package com.spring.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.ContactsMasterEntity;
import com.spring.service.ContactsService;

@RestController
@RequestMapping("/contacts")
public class ContactsController {

	private final ContactsService contactsService;

	public ContactsController(ContactsService contactsService) {
		this.contactsService = contactsService;
	}

	@PostMapping
	public ContactsMasterEntity createContact(@RequestBody ContactsMasterEntity contact) {
		return contactsService.saveContact(contact);
	}

	@GetMapping
	public List<ContactsMasterEntity> getContacts() {
		return contactsService.getAllContacts();
	}

	@GetMapping("/{id}")
	public ResponseEntity<ContactsMasterEntity> getContact(@PathVariable Integer id) {
		return contactsService.getContactById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteContact(@PathVariable Integer id) {
		contactsService.deleteContact(id);
		return ResponseEntity.noContent().build();
	}

	@GetMapping("/search")
	public ContactsMasterEntity getContactByName(@RequestParam String name) {
		return contactsService.getContactByName(name);
	}
}
