package com.awoniyitechnologies.climbingtrainingapiserver.models;

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

    private  String name;
    private Boolean status;
    private String notes;
    private Long weight_target;
    private Long weight_used;
    private Long rep_target;
    private Long rep_used;
    private Boolean template;

    @ManyToOne
    @JoinColumn(name="exercise_id")
    private Exercise exercise;

    @ManyToOne
    @JoinColumn(name="session_id")
    private Session session;

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

    public Long getWeight_target() { return weight_target; }
    public void setWeight_target(Long weight_target) { this.weight_target = weight_target; }

    public Long getWeight_used() { return weight_used; }
    public void setWeight_used(Long weight_used) { this.weight_used = weight_used; }

    public Long getRep_target() { return rep_target; }
    public void setRep_target(Long rep_target) { this.rep_target = rep_target; }

    public Long getRep_used() { return rep_used; }
    public void setRep_used(Long rep_used) { this.rep_used = rep_used; }

    public Boolean getTemplate() { return template; }
    public void setTemplate(Boolean template) { this.template = template; }
}
