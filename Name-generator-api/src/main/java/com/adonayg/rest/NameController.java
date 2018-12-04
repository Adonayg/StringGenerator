package com.adonayg.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adonayg.service.INameService;

@RestController
public class NameController {

	@Autowired
	private INameService service;

	@RequestMapping("${URL.method}")
	public String generateName(@PathVariable int charLength) {
		return service.generateName(charLength);

	}
}