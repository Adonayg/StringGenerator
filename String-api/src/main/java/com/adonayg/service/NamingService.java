package com.adonayg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.adonayg.domain.Name;
import com.adonayg.repository.NamingRepository;
import com.adonayg.util.NameProducer;
import com.adonayg.util.NamingRestTemplate;
import com.adonayg.util.NamingRules;

@Service
public class NamingService implements INamingService {

	@Autowired
	private NamingRepository namingRepo;
	
	@Autowired
	private NamingRestTemplate apiCaller;
	
	@Autowired
	private NameProducer producer;
	
	@Autowired
	private NamingRules potentialName;

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
		if(name.getPrefix().length() < name.getCharLength()) {
			name.setName(name.getPrefix() + apiCaller.getRandomName(name.getCharLength() - name.getPrefix().length()));
		} else {
			name.setName(name.getPrefix());
		}
		if (!potentialName.isAppropriate(name)) {
			name.setName("${dikembe}");
		}
		if (potentialName.isNameToLong(name)) {	
			name.setName(name.getName().substring(0, 6));
		}
		name.setName(name.getName().toLowerCase());
		StringUtils.capitalize(name.getName());
		producer.produce(name);
		return namingRepo.save(name);
	}

	public void setRepo(NamingRepository namingRepo) {
		this.namingRepo = namingRepo;
	}
}
