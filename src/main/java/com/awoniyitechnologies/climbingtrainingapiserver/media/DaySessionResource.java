package com.awoniyitechnologies.climbingtrainingapiserver.media;

public class DaySessionResource {
    private Long id;
    private String date;
    private String workoutType;
    private Boolean status;

    DaySessionResource() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public Boolean getStatus() { return status; }
    public void setStatus(Boolean status) { this.status = status; }

    public String getWorkoutType() { return workoutType; }
    public void setWorkoutType(String workoutType) { this.workoutType = workoutType; }
}
