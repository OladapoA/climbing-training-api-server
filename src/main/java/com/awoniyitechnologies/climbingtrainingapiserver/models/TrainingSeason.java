package com.awoniyitechnologies.climbingtrainingapiserver.models;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "training_seasons")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TrainingSeason {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Timestamp startDate;
    private Boolean status;

    @OneToMany
    @JoinColumn(name="training_season_id")
    private List<DaySession> daySessions;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Timestamp getStartDate() { return startDate; }
    public void setStartDate(Timestamp startDate) { this.startDate = startDate; }

    public Boolean getStatus() { return status; }
    public void setStatus(Boolean status) { this.status = status; }

    public List<DaySession> getDaySessions() { return daySessions; }
    public void setDaySession(List<DaySession> daySessions) { this.daySessions = daySessions; }
}
