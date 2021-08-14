package com.awoniyitechnologies.climbingtrainingapiserver.media;

import java.util.ArrayList;
import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.models.DaySession;

import org.springframework.stereotype.Component;

@Component
public class DaySessionResourceBuilder {

    public DaySessionResource toResource(DaySession daySession) {

        DaySessionResource resource = new DaySessionResource();

        resource.setId(daySession.getId());
        resource.setDate(daySession.getDate().toString());
        resource.setStatus(daySession.getStatus());

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
