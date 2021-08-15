package com.awoniyitechnologies.climbingtrainingapiserver.controllers;

import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.media.SessionResource;
import com.awoniyitechnologies.climbingtrainingapiserver.media.SessionResourceBuilder;
import com.awoniyitechnologies.climbingtrainingapiserver.models.Session;
import com.awoniyitechnologies.climbingtrainingapiserver.services.SessionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionController {

    private SessionService sessionService;
    private SessionResourceBuilder sessionResourceBuilder;

    @Autowired
    public SessionController(SessionService sessionService, SessionResourceBuilder sessionResourceBuilder) {
        this.sessionService = sessionService;
        this.sessionResourceBuilder = sessionResourceBuilder;
    }

    @GetMapping
    public List<SessionResource> getAllSessions() {
        List<Session> sessions = sessionService.getAllSessions();
        return sessionResourceBuilder.toResource(sessions);
    }

    @GetMapping
    @RequestMapping("{id}")
    public SessionResource getExercise(@PathVariable Long id) {
        Session session = sessionService.getSession(id);
        return sessionResourceBuilder.toResource(session);
    }
}
