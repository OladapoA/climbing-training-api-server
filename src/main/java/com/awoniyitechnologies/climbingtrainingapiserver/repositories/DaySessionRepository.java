package com.awoniyitechnologies.climbingtrainingapiserver.repositories;

import com.awoniyitechnologies.climbingtrainingapiserver.models.DaySession;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DaySessionRepository extends JpaRepository<DaySession, Long> {
    
}
