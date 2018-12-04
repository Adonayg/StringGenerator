package com.adonayg.util;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NameGenerator {
	
	@Value("${letters}")
	private String letters;
	
	public String generateName(int charLength) {
		Random randomObj = new Random();
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < charLength; i++) {
            builder.append(letters.toCharArray()[randomObj.ints(0, 25).findFirst().getAsInt()]);
		}
		return builder.toString();
	}
}
