package com.awoniyitechnologies.climbingtrainingapiserver.media;

import java.util.ArrayList;
import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.models.SessionExercise;

import org.springframework.stereotype.Component;

@Component
public class SessionExerciseResourceBuilder {

    public SessionExerciseResource toResource(SessionExercise sessionExercise) {

        SessionExerciseResource resource = new SessionExerciseResource();

        resource.setId(sessionExercise.getId());
        resource.setName(sessionExercise.getName());
        resource.setStatus(sessionExercise.getStatus());
        resource.setNotes(sessionExercise.getNotes());
        resource.setWeightTarget(sessionExercise.getWeightTarget());
        resource.setWeightUsed(sessionExercise.getWeightUsed());
        resource.setRepTarget(sessionExercise.getRepTarget());
        resource.setRepUsed(sessionExercise.getRepUsed());
        resource.setTemplate(sessionExercise.getTemplate());
        resource.setExercise(sessionExercise.getExercise());
        resource.setTime(sessionExercise.getTime());

        return resource;
    }

    public List<SessionExerciseResource> toResource(List<SessionExercise> sessionExercises) {
        List<SessionExerciseResource> resource = new ArrayList<SessionExerciseResource>();

        for (SessionExercise sessionExercise : sessionExercises){
            resource.add(this.toResource(sessionExercise));
        }

        return resource;
    }
}
