package com.adonayg.service;

import java.util.Optional;

import com.adonayg.domain.Name;
import com.adonayg.repository.NamingRepository;

public interface INamingService {

	Iterable<Name> getAll();

	String delete(Long id);

	Optional<Name> get(Long id);

	Name add(Name name);

	void setRepo(NamingRepository namingRepo);

}