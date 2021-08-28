package com.awoniyitechnologies.climbingtrainingapiserver.models;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "day_sessions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DaySession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Timestamp date;
    private Boolean status;

    @ManyToOne
    private TrainingSeason trainingSeason;

    @OneToMany
    @JoinColumn(name="day_session_id")
    private List<Session> sessions;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Timestamp getDate() { return date; }
    public void setDate(Timestamp date) { this.date = date; }

    public Boolean getStatus() { return status; }
    public void setStatus(Boolean status) { this.status = status; }

    public TrainingSeason getTrainingSeason() { return trainingSeason; }
    public void setTrainingSeason(TrainingSeason trainingSeason) { this.trainingSeason = trainingSeason; }
    
    public List<Session> getSessions() { return sessions; }
    public void setSessions(List<Session> sessions) { this.sessions = sessions; }
}
