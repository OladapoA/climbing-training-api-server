package com.awoniyitechnologies.climbingtrainingapiserver.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "training_session_ones")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TrainingSessionOne {
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
    private Exercise isolationOne;

    @ManyToOne
    @JoinColumn(name="exercise_id", insertable=false, updatable=false)
    private Exercise isolationTwo;

    @ManyToOne
    @JoinColumn(name="exercise_id", insertable=false, updatable=false)
    private Exercise isolationThree;

    @ManyToOne
    @JoinColumn(name="exercise_id", insertable=false, updatable=false)
    private Exercise climbing;

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

    public Exercise getIsolationOne() { return isolationOne; }
    public void setIsolationOne(Exercise isolationOne) { this.isolationOne = isolationOne; }

    public Exercise getIsolationTwo() { return isolationTwo; }
    public void setIsolationTwo(Exercise isolationTwo) { this.isolationTwo = isolationTwo; }

    public Exercise getIsolationThree() { return isolationThree; }
    public void setIsolationThree(Exercise isolationThree) { this.isolationThree = isolationThree; }

    public Exercise getClimbing() { return climbing; }
    public void setClimbing(Exercise climbing) { this.climbing = climbing; }

    public Exercise getCore() { return core; }
    public void setCore(Exercise core) { this.core = core; }

    public Exercise getCool_down() { return cool_down; }
    public void setCool_down(Exercise cool_down) { this.cool_down = cool_down; }
}
