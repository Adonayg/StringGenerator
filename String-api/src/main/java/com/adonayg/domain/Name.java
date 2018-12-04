package com.adonayg.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Name {
	@Id
	@GeneratedValue
	private long id;
	private String prefix;
	private int charLenght;
	private String name;
	
	public Name() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public int getCharLenght() {
		return charLenght;
	}
	public void setCharLenght(int charLenght) {
		this.charLenght = charLenght;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
