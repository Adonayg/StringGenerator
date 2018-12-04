package com.adonayg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adonayg.util.NameGenerator;

@Service
public class NameService {
	
	@Autowired
	private NameGenerator generator;
	
	public String generateName(int charLength) {
		return generator.generateName(charLength);
	}
}
