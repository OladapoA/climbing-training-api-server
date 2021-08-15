package com.awoniyitechnologies.climbingtrainingapiserver.media;

import java.sql.Time;
import java.util.List;

public class SessionResource {
    private Long id;

    private String name;
    private Boolean status;
    private String description;
    private Boolean template;
    private Time time;
    private List<SessionExerciseResource> sessionExercises;

    SessionResource() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public Boolean getStatus() { return status; }
    public void setStatus(Boolean status) { this.status = status; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Boolean getTemplate() { return template; }
    public void setTemplate(Boolean template) { this.template = template; }

    public Time getTime() { return time; }
    public void setTime(Time time) { this.time = time; }

    public List<SessionExerciseResource> getSessionExercises() { return sessionExercises; }
    public void setSessionExercises(List<SessionExerciseResource> sessionExercises) { this.sessionExercises = sessionExercises; }
}
