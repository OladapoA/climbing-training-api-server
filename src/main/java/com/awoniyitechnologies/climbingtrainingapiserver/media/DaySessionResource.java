package com.awoniyitechnologies.climbingtrainingapiserver.media;

import java.util.List;

public class DaySessionResource {
    private Long id;
    private String date;
    private Boolean status;
    private List<List<String>> sessions;

    DaySessionResource() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public Boolean getStatus() { return status; }
    public void setStatus(Boolean status) { this.status = status; }

    public List<List<String>> getSessions() { return sessions; }
    public void setSessions(List<List<String>> sessions) { this.sessions = sessions;}
}
