package com.awoniyitechnologies.climbingtrainingapiserver.models;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "exercises")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String subtype;
    private String name;
    private Long bookpage;
    private Boolean beginner;
    private Boolean intermediate;
    private Boolean advanced;
    private Long sets;
    private Long reps;
    private String repsSetsInfo;
    private Time time;
    private String description;
    private String progression;
    private String purpose;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getSubtype() { return subtype; }
    public void setSubtype(String subtype) { this.subtype = subtype; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Long getBookpage() { return bookpage; }
    public void setBookpage(Long bookpage) { this.bookpage = bookpage; }

    public Boolean getBeginner() { return beginner; }
    public void setBeginner(Boolean beginner) { this.beginner = beginner; }
    
    public Boolean getIntermediate() { return intermediate; }
    public void setIntermediate(Boolean intermediate) { this.intermediate = intermediate; }

    public Boolean getAdvanced() { return advanced; }
    public void setAdvanced(Boolean advanced) { this.advanced = advanced; }

    public Long getSets() { return sets; }
    public void setSets(Long sets) { this.sets = sets; }

    public Long getReps() { return reps; }
    public void setReps(Long reps) { this.reps = reps; }

    public String getRepsSetsInfo() { return repsSetsInfo; }
    public void setRepsSetsInfo(String repsSetsInfo) { this.repsSetsInfo = repsSetsInfo; } 

    public Time getTime() { return time; }
    public void setTime(Time time) { this.time = time; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getProgression() { return progression; }
    public void setProgression(String progression) { this.progression = progression; }

    public String getPurpose() { return purpose; }
    public void setPurpose(String purpose) { this.purpose = purpose; }
}
