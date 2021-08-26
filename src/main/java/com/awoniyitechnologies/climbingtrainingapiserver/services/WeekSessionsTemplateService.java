package com.awoniyitechnologies.climbingtrainingapiserver.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.awoniyitechnologies.climbingtrainingapiserver.models.Session;
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

    public WeekSessionsTemplate getWeekSessionsTemplate(Long id) {
        return weekSessionsTemplateRepository.getById(id);
    }

    public WeekSessionsTemplate getWeekSessionsTemplate(String name) {
        return weekSessionsTemplateRepository.findByName(name);
    }

    public List<Session> getWeekSessionsList(WeekSessionsTemplate weekSessionsTemplate) {
        List<Session> weekSessionsTemplateList = new ArrayList<>();
        weekSessionsTemplateList.add(weekSessionsTemplate.getMondaySession());
        weekSessionsTemplateList.add(weekSessionsTemplate.getTuesdaySession());
        weekSessionsTemplateList.add(weekSessionsTemplate.getWednesdaySession());
        weekSessionsTemplateList.add(weekSessionsTemplate.getThursdaySession());
        weekSessionsTemplateList.add(weekSessionsTemplate.getFridaySession());
        weekSessionsTemplateList.add(weekSessionsTemplate.getSaturdaySession());
        weekSessionsTemplateList.add(weekSessionsTemplate.getSundaySession());

        return weekSessionsTemplateList;
    }

    public List<Session> getWeekSessionsTemplateList(Long id) {
        WeekSessionsTemplate weekSessionsTemplate = getWeekSessionsTemplate(id);
        return getWeekSessionsList(weekSessionsTemplate);
    }

    public List<Session> getWeekSessionsTemplateList(String name) {
        WeekSessionsTemplate weekSessionsTemplate = getWeekSessionsTemplate(name);
        return getWeekSessionsList(weekSessionsTemplate);
    }
}
