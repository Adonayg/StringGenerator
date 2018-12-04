package com.adonayg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.adonayg.domain.NameMessage;

@Repository
public interface ConsumerRepository extends MongoRepository<NameMessage, Long> {

}
