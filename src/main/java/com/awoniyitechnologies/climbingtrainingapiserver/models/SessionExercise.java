package com.awoniyitechnologies.climbingtrainingapiserver.models;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "session_exercises")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SessionExercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Boolean status;
    private String notes;
    private Long weightTarget;
    private Long weightUsed;
    private Long repTarget;
    private Long repUsed;
    private Boolean template;
    private Time time;

    @ManyToOne
    @JoinColumn(name="exercise_id")
    private Exercise exercise;

    @ManyToOne
    @JoinColumn(name="session_id")
    private Session session;

    public SessionExercise() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Boolean getStatus() { return status; }
    public void setStatus(Boolean status) { this.status = status; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    public Exercise getExercise() { return exercise;  }
    public void setExercise(Exercise exercise) { this.exercise = exercise; }

    public Session getSession() { return session; }
    public void setSession(Session session) { this.session = session; }

    public Long getWeightTarget() { return weightTarget; }
    public void setWeightTarget(Long weightTarget) { this.weightTarget = weightTarget; }

    public Long getWeightUsed() { return weightUsed; }
    public void setWeightUsed(Long weightUsed) { this.weightUsed = weightUsed; }

    public Long getRepTarget() { return repTarget; }
    public void setRepTarget(Long repTarget) { this.repTarget = repTarget; }

    public Long getRepUsed() { return repUsed; }
    public void setRepUsed(Long repUsed) { this.repUsed = repUsed; }

    public Boolean getTemplate() { return template; }
    public void setTemplate(Boolean template) { this.template = template; }

    public Time getTime() { return time; }
    public void setTime(Time time) { this.time = time; }
}
