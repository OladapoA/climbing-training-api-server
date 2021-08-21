package com.awoniyitechnologies.climbingtrainingapiserver.media;

import java.util.ArrayList;
import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.models.WeekSessionsTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeekSessionsTemplateResourceBuilder {

    private SessionResourceBuilder sessionResourceBuilder;

    @Autowired
    public WeekSessionsTemplateResourceBuilder (SessionResourceBuilder sessionResourceBuilder) {
        this.sessionResourceBuilder = sessionResourceBuilder;
    }
    
    public WeekSessionsTemplateResource toResource(WeekSessionsTemplate weekWeekSessionsTemplate) {

        WeekSessionsTemplateResource resource = new WeekSessionsTemplateResource();

        resource.setId(weekWeekSessionsTemplate.getId());
        resource.setName(weekWeekSessionsTemplate.getName());
        resource.setDescription(weekWeekSessionsTemplate.getDescription());
        resource.setMondaySession(sessionResourceBuilder.toResource(weekWeekSessionsTemplate.getMondaySession()));
        resource.setTuesdaySession(sessionResourceBuilder.toResource(weekWeekSessionsTemplate.getTuesdaySession()));
        resource.setWednesdaySession(sessionResourceBuilder.toResource(weekWeekSessionsTemplate.getWednesdaySession()));
        resource.setThursdaySession(sessionResourceBuilder.toResource(weekWeekSessionsTemplate.getThursdaySession()));
        resource.setFridaySession(sessionResourceBuilder.toResource(weekWeekSessionsTemplate.getFridaySession()));
        resource.setSaturdaySession(sessionResourceBuilder.toResource(weekWeekSessionsTemplate.getSaturdaySession()));
        resource.setSundaySession(sessionResourceBuilder.toResource(weekWeekSessionsTemplate.getSundaySession()));

        return resource;
    }

    public List<WeekSessionsTemplateResource> toResource(List<WeekSessionsTemplate> weekSessionsTemplates) {
        List<WeekSessionsTemplateResource> resource = new ArrayList<WeekSessionsTemplateResource>();

        for (WeekSessionsTemplate weekSessionsTemplate : weekSessionsTemplates){
            resource.add(this.toResource(weekSessionsTemplate));
        }

        return resource;
    }
}
