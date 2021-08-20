package com.awoniyitechnologies.climbingtrainingapiserver.repositories;

import com.awoniyitechnologies.climbingtrainingapiserver.models.SessionExercise;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionExerciseRepository extends JpaRepository<SessionExercise, Long> {
    
}
