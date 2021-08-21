package com.awoniyitechnologies.climbingtrainingapiserver.controllers;

import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.media.WeekSessionsTemplateResource;
import com.awoniyitechnologies.climbingtrainingapiserver.media.WeekSessionsTemplateResourceBuilder;
import com.awoniyitechnologies.climbingtrainingapiserver.models.WeekSessionsTemplate;
import com.awoniyitechnologies.climbingtrainingapiserver.services.WeekSessionsTemplateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/week-sessions-template")
public class WeekSessionsTemplateController {
    
    private WeekSessionsTemplateService weekSessionsTemplateService;
    private WeekSessionsTemplateResourceBuilder weekSessionsTemplateResourceBuilder;

    @Autowired
    public WeekSessionsTemplateController(WeekSessionsTemplateService weekSessionsTemplateService,
            WeekSessionsTemplateResourceBuilder weekSessionsTemplateResourceBuilder) {
        this.weekSessionsTemplateService = weekSessionsTemplateService;
        this.weekSessionsTemplateResourceBuilder = weekSessionsTemplateResourceBuilder;
    }

    @GetMapping
    public List<WeekSessionsTemplateResource> getAllWeekSessionsTemplates() {
        List<WeekSessionsTemplate> weekSessionsTemplates = weekSessionsTemplateService.getAllWeekSessionsTemplates();
        return weekSessionsTemplateResourceBuilder.toResource(weekSessionsTemplates);
    }
}
