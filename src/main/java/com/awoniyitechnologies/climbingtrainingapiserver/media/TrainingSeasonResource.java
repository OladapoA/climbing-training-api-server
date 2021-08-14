package com.awoniyitechnologies.climbingtrainingapiserver.media;

import java.util.List;

public class TrainingSeasonResource {
    private Long id;
    private String startDate;
    private Boolean status;
    private List<DaySessionResource> daySessions;

    public TrainingSeasonResource() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }

    public Boolean getStatus() { return status; }
    public void setStatus(Boolean status) { this.status = status; }

    public List<DaySessionResource> getDaySessions() { return daySessions; }
    public void setDaySession(List<DaySessionResource> daySessions) { this.daySessions = daySessions; }
}
