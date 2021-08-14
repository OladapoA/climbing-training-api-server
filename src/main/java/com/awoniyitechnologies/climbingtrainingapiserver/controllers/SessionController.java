package com.awoniyitechnologies.climbingtrainingapiserver.controllers;

import java.util.List;

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

    @Autowired
    public SessionController(SessionService sessionService) {
        this.sessionService = sessionService;
    }

    @GetMapping
    public List<Session> getAllSessions() {
        List<Session> sessions = sessionService.getAllSessions();
        return sessions;
    }

    @GetMapping
    @RequestMapping("{id}")
    public Session getExercise(@PathVariable Long id) {
        return sessionService.getSession(id);
    }
}
