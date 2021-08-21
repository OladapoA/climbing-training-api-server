package com.awoniyitechnologies.climbingtrainingapiserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "week_sessions_template")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class WeekSessionsTemplate {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @OneToOne
    private Session mondaySession;
    
    @OneToOne
    private Session tuesdaySession;
    
    @OneToOne
    private Session wednesdaySession;
    
    @OneToOne
    private Session thursdaySession;
    
    @OneToOne
    private Session fridaySession;
    
    @OneToOne
    private Session saturdaySession;
    
    @OneToOne
    private Session sundaySession;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; } 

    public Session getMondaySession() { return mondaySession; }
    public void setMondaySession(Session mondaySession) { this.mondaySession = mondaySession; }

    public Session getTuesdaySession() { return tuesdaySession; }
    public void setTuesdaySession(Session tuesdaySession) { this.tuesdaySession = tuesdaySession; }

    public Session getWednesdaySession() { return wednesdaySession; }
    public void setWednesdaySession(Session wednesdaySession) { this.wednesdaySession = wednesdaySession; }

    public Session getThursdaySession() { return thursdaySession; }
    public void setThursdaySession(Session thursdaySession) { this.thursdaySession = thursdaySession; }

    public Session getFridaySession() { return fridaySession; }
    public void setFridaySession(Session fridaySession) { this.fridaySession = fridaySession; }

    public Session getSaturdaySession() { return saturdaySession; }
    public void setSaturdaySession(Session saturdaySession) { this.saturdaySession = saturdaySession; }

    public Session getSundaySession() { return sundaySession; }
    public void setSundaySession(Session sundaySession) { this.sundaySession = sundaySession; }
}