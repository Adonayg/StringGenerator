package com.adonayg.service;

import java.util.Optional;

import com.adonayg.domain.NameMessage;
import com.adonayg.repository.ConsumerRepository;

public interface IConsumerService {

	Iterable<NameMessage> getAll();

	NameMessage add(NameMessage name);

	void delete(Long id);

	Optional<NameMessage> get(Long id);

	void setRepo(ConsumerRepository consumerRepo);

}