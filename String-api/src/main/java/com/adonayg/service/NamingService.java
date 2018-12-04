package com.adonayg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adonayg.domain.Name;
import com.adonayg.repository.NamingRepository;

@Service
public class NamingService implements INamingService {

	@Autowired
	private NamingRepository namingRepo;

	public Iterable<Name> getAll() {
		return namingRepo.findAll();
	}

	public String delete(Long id) {
		namingRepo.deleteById(id);
		return "${delete.message}";
	}

	public Optional<Name> get(Long id) {
		return namingRepo.findById(id);
	}

	public Name add(Name name) {
		return namingRepo.save(name);
	}

	public void setRepo(NamingRepository namingRepo) {
		this.namingRepo = namingRepo;
	}
}
