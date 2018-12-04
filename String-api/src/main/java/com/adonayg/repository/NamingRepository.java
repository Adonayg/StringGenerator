package com.adonayg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adonayg.domain.Name;

@Repository
public interface NamingRepository extends JpaRepository<Name, Long> {

}
