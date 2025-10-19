package com.spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contacts_data")
public class ContactsMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "contact_id")
	private Integer id;

	@Column(name = "contact_name")
	private String name;

	@Column(name = "contact_number")
	private Long number;

	public ContactsMasterEntity() {
	}

	public ContactsMasterEntity(String name, Long number) {
		this.name = name;
		this.number = number;
	}

	// Getters & Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "ContactsMasterEntity [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
}
