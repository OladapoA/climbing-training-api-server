package com.awoniyitechnologies.climbingtrainingapiserver.services;

import java.util.List;

import javax.transaction.Transactional;

import com.awoniyitechnologies.climbingtrainingapiserver.models.WeekSessionsTemplate;
import com.awoniyitechnologies.climbingtrainingapiserver.repositories.WeekSessionsTemplateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class WeekSessionsTemplateService {
    private WeekSessionsTemplateRepository weekSessionsTemplateRepository;

    @Autowired
    public WeekSessionsTemplateService(WeekSessionsTemplateRepository weekSessionsTemplateRepository,
            DaySessionService daySessionService) {
        this.weekSessionsTemplateRepository = weekSessionsTemplateRepository;
    }

    public List<WeekSessionsTemplate> getAllWeekSessionsTemplates() {
        return weekSessionsTemplateRepository.findAll();
    }
}
