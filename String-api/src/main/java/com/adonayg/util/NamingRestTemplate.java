package com.adonayg.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class NamingRestTemplate {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${URL.name.base}" + "${URL.name.method}")
	private String randomNameGeneratorURL;

	
	public String getRandomName(int charLength) {
		return restTemplate.getForObject(randomNameGeneratorURL + charLength, String.class);
	}
}
