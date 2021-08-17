package com.awoniyitechnologies.climbingtrainingapiserver.media;

import java.util.ArrayList;
import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.models.DaySession;
import com.awoniyitechnologies.climbingtrainingapiserver.models.Session;

import org.springframework.stereotype.Component;

@Component
public class DaySessionResourceBuilder {

    public DaySessionResource toResource(DaySession daySession) {

        DaySessionResource resource = new DaySessionResource();

        resource.setId(daySession.getId());
        resource.setDate(daySession.getDate().toString());
        resource.setStatus(daySession.getStatus());

        List<List<String>> sessionsList = new ArrayList<>();

        for (Session session : daySession.getSessions()){
            List<String> sessionList = new ArrayList<>();
            sessionList.add(session.getId().toString());
            sessionList.add(session.getName());
            if (session.getStatus() != null) {
                sessionList.add(session.getStatus().toString());
            } else {
                sessionList.add(null);
            }        
            sessionsList.add(sessionList);
        }

        resource.setSessions(sessionsList);

        return resource;
    }

    public List<DaySessionResource> toResource(List<DaySession> daySessions) {
        List<DaySessionResource> resource = new ArrayList<DaySessionResource>();

        for (DaySession daySession : daySessions){
            resource.add(this.toResource(daySession));
        }

        return resource;
    }
}
