package com.awoniyitechnologies.climbingtrainingapiserver.services;

import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.models.Session;
import com.awoniyitechnologies.climbingtrainingapiserver.repositories.SessionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SessionService {
    private SessionRepository sessionRepository;

    @Autowired
    public SessionService(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    public List<Session> getAllSessions() {
        return sessionRepository.findAll();
    }

    public Session getSession(Long id) {
        return sessionRepository.getById(id);
    }
}
