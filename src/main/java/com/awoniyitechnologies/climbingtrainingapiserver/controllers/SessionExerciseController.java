package com.awoniyitechnologies.climbingtrainingapiserver.controllers;

import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.media.SessionExerciseResource;
import com.awoniyitechnologies.climbingtrainingapiserver.media.SessionExerciseResourceBuilder;
import com.awoniyitechnologies.climbingtrainingapiserver.models.SessionExercise;
import com.awoniyitechnologies.climbingtrainingapiserver.services.SessionExerciseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/session-exercises")
public class SessionExerciseController {
    
    private SessionExerciseService sessionExerciseService;
    private SessionExerciseResourceBuilder sessionExerciseResourceBuilder;

    @Autowired
    public SessionExerciseController(SessionExerciseService sessionExerciseService,
                SessionExerciseResourceBuilder sessionExerciseResourceBuilder) {
        this.sessionExerciseService = sessionExerciseService;
        this.sessionExerciseResourceBuilder = sessionExerciseResourceBuilder;
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
    
}
