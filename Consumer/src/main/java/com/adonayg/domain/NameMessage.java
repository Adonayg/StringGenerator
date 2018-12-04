package com.adonayg.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class NameMessage {
	@Id
	public ObjectId _id;
	private String name;
	
	public NameMessage() {
		
	}
	
	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
