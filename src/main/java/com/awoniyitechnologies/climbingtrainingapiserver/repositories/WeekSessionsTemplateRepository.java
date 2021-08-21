package com.awoniyitechnologies.climbingtrainingapiserver.repositories;

import com.awoniyitechnologies.climbingtrainingapiserver.models.WeekSessionsTemplate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WeekSessionsTemplateRepository extends JpaRepository<WeekSessionsTemplate, Long> {
    
}
