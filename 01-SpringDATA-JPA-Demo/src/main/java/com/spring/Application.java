package com.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.spring.entities.ContactsMasterEntity;
import com.spring.repository.ContactsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner demo(ContactsRepository contactsRepository) {
	    return args -> {
	        System.out.println("========== CRUD demo started ==========");

	        // CREATE
	        ContactsMasterEntity contact = new ContactsMasterEntity();
	        contact.setName("Srinu Katta");
	        contact.setNumber(9391639166L);
	        ContactsMasterEntity saved = contactsRepository.save(contact);
	        System.out.println("Saved: " + saved);

	        // READ ALL
	        System.out.println("All contacts:");
	        contactsRepository.findAll().forEach(System.out::println);

	        // UPDATE
	        saved.setName("Srinu Updated");
	        saved.setNumber(9988776655L);
	        contactsRepository.save(saved);
	        System.out.println("Updated: " + saved);

	        // DELETE
	        contactsRepository.delete(saved);
	        System.out.println("Deleted contact: " + saved);
	    };
	}
}