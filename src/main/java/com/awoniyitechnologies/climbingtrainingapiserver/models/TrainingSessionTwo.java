package com.awoniyitechnologies.climbingtrainingapiserver.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "training_session_twos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TrainingSessionTwo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Timestamp time;
    private Boolean status;

    @ManyToOne
    @JoinColumn(name="exercise_id", insertable=false, updatable=false)
    private Exercise warmUp;

    @ManyToOne
    @JoinColumn(name="exercise_id", insertable=false, updatable=false)
    private Exercise climbingOne;

    @ManyToOne
    @JoinColumn(name="exercise_id", insertable=false, updatable=false)
    private Exercise climbingTwo;

    @ManyToOne
    @JoinColumn(name="exercise_id", insertable=false, updatable=false)
    private Exercise climbingThree;

    @ManyToOne
    @JoinColumn(name="exercise_id", insertable=false, updatable=false)
    private Exercise core;

    @ManyToOne
    @JoinColumn(name="exercise_id", insertable=false, updatable=false)
    private Exercise cool_down;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Timestamp getTime() { return time; }
    public void setTime(Timestamp time) { this.time = time; }

    public Boolean getStatus() { return status; }
    public void setStatus(Boolean status) { this.status = status; }

    public Exercise getWarmUp() { return warmUp; }
    public void setWarmUp(Exercise warmUp) { this.warmUp = warmUp; }

    public Exercise getClimbingOne() { return climbingOne; }
    public void setClimbingOne(Exercise climbingOne) { this.climbingOne = climbingOne; }

    public Exercise getClimbingTwo() { return climbingTwo; }
    public void setClimbingTwo(Exercise climbingTwo) { this.climbingTwo = climbingTwo; }

    public Exercise getClimbingThree() { return climbingThree; }
    public void setClimbingThree(Exercise climbingThree) { this.climbingThree = climbingThree; }

    public Exercise getCore() { return core; }
    public void setCore(Exercise core) { this.core = core; }

    public Exercise getCool_down() { return cool_down; }
    public void setCool_down(Exercise cool_down) { this.cool_down = cool_down; }
}
