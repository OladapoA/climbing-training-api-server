package com.awoniyitechnologies.climbingtrainingapiserver.services;

import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.models.Session;
import com.awoniyitechnologies.climbingtrainingapiserver.models.SessionExercise;
import com.awoniyitechnologies.climbingtrainingapiserver.repositories.SessionExerciseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SessionExerciseService {
    private SessionExerciseRepository sessionExerciseRepository;

    @Autowired
    public SessionExerciseService (SessionExerciseRepository sessionExerciseRepository) {
        this.sessionExerciseRepository = sessionExerciseRepository;
    }

    public List<SessionExercise> getAllSessionExercises() {
        return sessionExerciseRepository.findAll();
    }

    public SessionExercise getSessionExercise(Long id) {
        return sessionExerciseRepository.getById(id);
    }

    public void copyTemplateToSession(Session session, List<SessionExercise> templateSessionExercises) {
        for (SessionExercise sessionExercise : templateSessionExercises) {
            SessionExercise newSessionExercise = new SessionExercise();
            newSessionExercise.setSession(session);
            newSessionExercise.setName(sessionExercise.getName());
            newSessionExercise.setTime(sessionExercise.getTime());
            newSessionExercise.setTemplate(false);
            sessionExerciseRepository.saveAndFlush(newSessionExercise);
        }
    }
}
