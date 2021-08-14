package com.awoniyitechnologies.climbingtrainingapiserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "gym_outdoor_sessions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class GymOutdoorSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Boolean status;

    @ManyToOne
    @JoinColumn(name="exercise_id", insertable=false, updatable=false)
    private Exercise exercise;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Boolean getStatus() { return status; }
    public void setStatus(Boolean status) { this.status = status; }

    public Exercise getExercise() { return exercise; }
    public void setExercisep(Exercise exercise) { this.exercise = exercise; }
}
