package com.awoniyitechnologies.climbingtrainingapiserver.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "core_cardio_sessions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CoreCardioSession {
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
    private Exercise coreOne;

    @ManyToOne
    @JoinColumn(name="exercise_id", insertable=false, updatable=false)
    private Exercise coreTwo;

    @ManyToOne
    @JoinColumn(name="exercise_id", insertable=false, updatable=false)
    private Exercise cardioOne;

    @ManyToOne
    @JoinColumn(name="exercise_id", insertable=false, updatable=false)
    private Exercise cardioTwo;

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

    public Exercise getCoreOne() { return coreOne; }
    public void setCoreOne(Exercise coreOne) { this.coreOne = coreOne; }

    public Exercise getCoreTwo() { return coreTwo; }
    public void setCoreTwo(Exercise coreTwo) { this.coreTwo = coreTwo; }

    public Exercise getCardioOne() { return cardioOne; }
    public void setCardioOne(Exercise cardioOne) { this.cardioOne = cardioOne; }

    public Exercise getCardioTwo() { return cardioTwo; }
    public void setCardioTwo(Exercise cardioTwo) { this.cardioTwo = cardioTwo; }

    public Exercise getCool_down() { return cool_down; }
    public void setCool_down(Exercise cool_down) { this.cool_down = cool_down; }
}
