package com.adonayg.util;

import org.springframework.stereotype.Component;

import com.adonayg.domain.Name;

@Component
public class NamingRules {
	
	public boolean isNameToLong(Name name) {
		if(name.getName().length() >= 12) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isAppropriate(Name name) {
		if(name.getName().toLowerCase().contains("${batman}") || name.getName().toLowerCase().contains("${nutella}") || name.getName().toLowerCase().contains("${rambo}")) {
			return false;
		} else {
			return true;
		}
	}
	
}
