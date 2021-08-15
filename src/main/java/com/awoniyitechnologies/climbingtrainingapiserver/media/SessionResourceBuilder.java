package com.awoniyitechnologies.climbingtrainingapiserver.media;

import java.util.ArrayList;
import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.models.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SessionResourceBuilder {

    private SessionExerciseResourceBuilder sessionExerciseResourceBuilder;

    @Autowired
    public SessionResourceBuilder(SessionExerciseResourceBuilder sessionExerciseResourceBuilder){
        this.sessionExerciseResourceBuilder = sessionExerciseResourceBuilder;
    }

    public SessionResource toResource(Session session) {

        SessionResource resource = new SessionResource();

        resource.setId(session.getId());
        resource.setName(session.getName());
        resource.setStatus(session.getStatus());
        resource.setDescription(session.getDescription());
        resource.setTemplate(session.getTemplate());
        resource.setTime(session.getTime());

        List<SessionExerciseResource> sessionExerciseResources = sessionExerciseResourceBuilder.toResource(session.getSessionExercises());
        resource.setSessionExercises(sessionExerciseResources);

        return resource;
    }

    public List<SessionResource> toResource(List<Session> sessions) {
        List<SessionResource> resource = new ArrayList<SessionResource>();

        for (Session session : sessions){
            resource.add(this.toResource(session));
        }

        return resource;
    }
}
