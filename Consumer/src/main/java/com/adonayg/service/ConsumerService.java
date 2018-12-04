package com.adonayg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adonayg.domain.NameMessage;
import com.adonayg.repository.ConsumerRepository;

@Service
public class ConsumerService {

	@Autowired
	private ConsumerRepository consumerRepo;

	public Iterable<NameMessage> getAll() {
		return consumerRepo.findAll();
	}

	public NameMessage add(NameMessage name) {
		return consumerRepo.save(name);
	}

	public void delete(Long id) {
		consumerRepo.deleteById(id);
	}

	public Optional<NameMessage> get(Long id) {
		return consumerRepo.findById(id);
	}

	public void setRepo(ConsumerRepository consumerRepo) {
		this.consumerRepo = consumerRepo;
	}
}
