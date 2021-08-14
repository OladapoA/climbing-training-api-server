package com.awoniyitechnologies.climbingtrainingapiserver.repositories;

import com.awoniyitechnologies.climbingtrainingapiserver.models.TrainingSeason;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingSeasonRepository extends JpaRepository<TrainingSeason, Long> {
    
}
