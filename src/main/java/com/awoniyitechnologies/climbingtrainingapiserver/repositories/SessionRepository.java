package com.awoniyitechnologies.climbingtrainingapiserver.repositories;

import com.awoniyitechnologies.climbingtrainingapiserver.models.Session;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
    
}
