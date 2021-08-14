package com.awoniyitechnologies.climbingtrainingapiserver.controllers;

import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.models.DaySession;
import com.awoniyitechnologies.climbingtrainingapiserver.services.DaySessionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/day-sessions")
public class DaySessionController {
    private DaySessionService daySessionService;

    @Autowired
    public DaySessionController(DaySessionService daySessionService) {
        this.daySessionService =daySessionService;
    }

    @GetMapping
    public List<DaySession> getAllDaySessions() {
        List<DaySession> daySessions = daySessionService.getAllDaySessions();
        return daySessions;
    }
}
