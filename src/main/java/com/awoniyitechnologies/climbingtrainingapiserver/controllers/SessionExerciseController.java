package com.awoniyitechnologies.climbingtrainingapiserver.controllers;

import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.media.SessionExerciseResource;
import com.awoniyitechnologies.climbingtrainingapiserver.media.SessionExerciseResourceBuilder;
import com.awoniyitechnologies.climbingtrainingapiserver.models.SessionExercise;
import com.awoniyitechnologies.climbingtrainingapiserver.services.DaySessionService;
import com.awoniyitechnologies.climbingtrainingapiserver.services.SessionExerciseService;
import com.awoniyitechnologies.climbingtrainingapiserver.services.SessionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/session-exercises")
public class SessionExerciseController {
    
    private SessionExerciseService sessionExerciseService;
    private SessionExerciseResourceBuilder sessionExerciseResourceBuilder;
    private SessionService sessionService;
    private DaySessionService daySessionService;

    @Autowired
    public SessionExerciseController(SessionExerciseService sessionExerciseService,
                SessionExerciseResourceBuilder sessionExerciseResourceBuilder, SessionService sessionService,
                DaySessionService daySessionService) {
        this.sessionExerciseService = sessionExerciseService;
        this.sessionExerciseResourceBuilder = sessionExerciseResourceBuilder;
        this.sessionService = sessionService;
        this.daySessionService = daySessionService;
    }

    @GetMapping
    public List<SessionExerciseResource> getAllSessionExercises() {
        List<SessionExercise> sessions = sessionExerciseService.getAllSessionExercises();
        return sessionExerciseResourceBuilder.toResource(sessions);
    }

    @GetMapping
    @RequestMapping("{id}")
    public SessionExerciseResource getSessionExercise(@PathVariable Long id) {
        SessionExercise sessionExercise = sessionExerciseService.getSessionExercise(id);
        return sessionExerciseResourceBuilder.toResource(sessionExercise);
    }

    @RequestMapping(path = "{id}/status", method = RequestMethod.PUT)
    public SessionExerciseResource setSessionExerciseStatus(@PathVariable Long id, @RequestParam String status) {
        SessionExercise sessionExercise = sessionExerciseService.setSessionExerciseStatus(id, status);
        if (sessionExercise.getSession() != null) {
            sessionService.updateSessionStatus(sessionExercise.getSession());
            if (sessionExercise.getSession().getDaySession() != null) {
                daySessionService.updateDaySessionStatus(sessionExercise.getSession().getDaySession());
            }
        }
        return sessionExerciseResourceBuilder.toResource(sessionExercise);
    }    
}
