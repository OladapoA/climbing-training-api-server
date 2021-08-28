package com.awoniyitechnologies.climbingtrainingapiserver.models;

import java.sql.Time;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "sessions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String name;
    private Boolean status;
    private String description;
    private Boolean template;
    private Time time;

    @OneToMany
    @JoinColumn(name="session_id")
    @OrderBy(value = "id ASC")
    private List<SessionExercise> sessionExercises;

    @ManyToOne
    @JoinColumn(name="day_session_id")
    private DaySession daySession;

    public Session() {}

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

    public List<SessionExercise> getSessionExercises() { return sessionExercises; }
    public void setSessionExercises(List<SessionExercise> sessionExercises) { this.sessionExercises = sessionExercises; }

    public DaySession getDaySession() { return daySession; }
    public void setDaySession(DaySession daySession) { this.daySession = daySession; }
}
