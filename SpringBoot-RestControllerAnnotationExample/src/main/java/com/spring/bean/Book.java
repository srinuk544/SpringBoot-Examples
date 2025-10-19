package com.spring.bean;

public class Book {
	private String name;
	private int id;
	private String title;

	public Book(String name, int id, String title) {

		this.name = name;
		this.id = id;
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
