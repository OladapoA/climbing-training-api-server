package com.awoniyitechnologies.climbingtrainingapiserver.media;

public class WeekSessionsTemplateResource {
    private Long id;
    private String name;
    private String description;
    private SessionResource mondaySession;
    private SessionResource tuesdaySession;
    private SessionResource wednesdaySession;
    private SessionResource thursdaySession;
    private SessionResource fridaySession;
    private SessionResource saturdaySession;
    private SessionResource sundaySession;

    public WeekSessionsTemplateResource() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; } 

    public SessionResource getMondaySession() { return mondaySession; }
    public void setMondaySession(SessionResource mondaySession) { this.mondaySession = mondaySession; }

    public SessionResource getTuesdaySession() { return tuesdaySession; }
    public void setTuesdaySession(SessionResource tuesdaySession) { this.tuesdaySession = tuesdaySession; }

    public SessionResource getWednesdaySession() { return wednesdaySession; }
    public void setWednesdaySession(SessionResource wednesdaySession) { this.wednesdaySession = wednesdaySession; }

    public SessionResource getThursdaySession() { return thursdaySession; }
    public void setThursdaySession(SessionResource thursdaySession) { this.thursdaySession = thursdaySession; }

    public SessionResource getFridaySession() { return fridaySession; }
    public void setFridaySession(SessionResource fridaySession) { this.fridaySession = fridaySession; }

    public SessionResource getSaturdaySession() { return saturdaySession; }
    public void setSaturdaySession(SessionResource saturdaySession) { this.saturdaySession = saturdaySession; }

    public SessionResource getSundaySession() { return sundaySession; }
    public void setSundaySession(SessionResource sundaySession) { this.sundaySession = sundaySession; }
}
