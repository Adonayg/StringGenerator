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
	private int charLength;
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
	public int getCharLength() {
		return charLength;
	}
	public void setCharLength(int charLength) {
		this.charLength = charLength;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
