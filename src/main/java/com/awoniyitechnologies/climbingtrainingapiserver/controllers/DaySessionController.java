package com.awoniyitechnologies.climbingtrainingapiserver.controllers;

import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.media.DaySessionResource;
import com.awoniyitechnologies.climbingtrainingapiserver.media.DaySessionResourceBuilder;
import com.awoniyitechnologies.climbingtrainingapiserver.models.DaySession;
import com.awoniyitechnologies.climbingtrainingapiserver.services.DaySessionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/day-sessions")
public class DaySessionController {
    private DaySessionService daySessionService;
    private DaySessionResourceBuilder daySessionResourceBuilder;

    @Autowired
    public DaySessionController(DaySessionService daySessionService, DaySessionResourceBuilder daySessionResourceBuilder) {
        this.daySessionService = daySessionService;
        this.daySessionResourceBuilder = daySessionResourceBuilder;
    }

    @GetMapping
    public List<DaySessionResource> getAllDaySessions() {
        List<DaySession> daySessions = daySessionService.getAllDaySessions();
        return daySessionResourceBuilder.toResource(daySessions);
    }

    @GetMapping
    @RequestMapping("{id}")
    public DaySessionResource getDaySession(@PathVariable Long id) {
        DaySession daySession = daySessionService.getDaySession(id);
        return daySessionResourceBuilder.toResource(daySession);
    }
}
