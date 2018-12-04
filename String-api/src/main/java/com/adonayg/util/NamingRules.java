package com.adonayg.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.adonayg.domain.Name;

@Component
public class NamingRules {
	
	@Value("${batman}")
	private String batman;
	
	@Value("${rambo}")
	private String rambo;
	
	@Value("${nutella}")
	private String nutella;
	
	public boolean isNameToLong(Name name) {
		if(name.getName().length() >= 12) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isAppropriate(Name name) {
		if(name.getName().toLowerCase().contains(batman) || name.getName().toLowerCase().contains(nutella) || name.getName().toLowerCase().contains(rambo)) {
			return false;
		} else {
			return true;
		}
	}
	
}
