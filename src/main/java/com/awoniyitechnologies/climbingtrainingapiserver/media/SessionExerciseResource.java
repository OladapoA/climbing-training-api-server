package com.awoniyitechnologies.climbingtrainingapiserver.media;

import com.awoniyitechnologies.climbingtrainingapiserver.models.Exercise;

public class SessionExerciseResource {
    private Long id;
    private String name;
    private Boolean status;
    private String notes;
    private Long weightTarget;
    private Long weightUsed;
    private Long repTarget;
    private Long repUsed;
    private Boolean template;
    private Exercise exercise;

    SessionExerciseResource() {}

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
}
