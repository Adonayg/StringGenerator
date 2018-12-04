package com.adonayg.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adonayg.domain.Name;
import com.adonayg.service.INamingService;

@RequestMapping("${URL.base}")
@RestController
public class NamingController {
	
	@Autowired
	private INamingService service;

	@GetMapping
	public Iterable<Name> getAllNames() {
		return service.getAll();
	}

	@GetMapping("${URL.method.getName}")
	public Optional<Name> getName(@PathVariable Long ID) {
		return service.get(ID);
	}

	@DeleteMapping("${URL.method.deleteName}")
	public void deleteName(@PathVariable Long ID) {
		service.delete(ID);
	}

	@PostMapping("${URL.method.addName}")
	public Name addName(@RequestBody Name name) {
		return service.add(name);
	}
}
