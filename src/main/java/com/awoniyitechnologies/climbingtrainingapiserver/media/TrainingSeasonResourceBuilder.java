package com.awoniyitechnologies.climbingtrainingapiserver.media;

import java.util.ArrayList;
import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.models.DaySession;
import com.awoniyitechnologies.climbingtrainingapiserver.models.TrainingSeason;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrainingSeasonResourceBuilder {

    private DaySessionResourceBuilder daySessionResourceBuilder;

    @Autowired
    public TrainingSeasonResourceBuilder(DaySessionResourceBuilder daySessionResourceBuilder) {
        this.daySessionResourceBuilder = daySessionResourceBuilder;
    }
    
    public TrainingSeasonResource toResource(TrainingSeason trainingSeason) {

        TrainingSeasonResource resource = new TrainingSeasonResource();

        resource.setId(trainingSeason.getId());
        resource.setStartDate(trainingSeason.getStartDate().toString());
        resource.setStatus(trainingSeason.getStatus());
        
        List<List<String>> DaySessionsList = new ArrayList<>();

        for (DaySession daySession : trainingSeason.getDaySessions()){
            List<String> daySessionItems = new ArrayList<>();
            daySessionItems.add(daySession.getId().toString());
            daySessionItems.add(daySession.getDate().toString());
            if (daySession.getStatus() != null) {
                daySessionItems.add(daySession.getStatus().toString());
            } else {
                daySessionItems.add(null);
            }        
            DaySessionsList.add(daySessionItems);
        }
        resource.setDaySessions(DaySessionsList);

        return resource;
    }

    public List<TrainingSeasonResource> toResource(List<TrainingSeason> trainingSeasons) {
        List<TrainingSeasonResource> resource = new ArrayList<TrainingSeasonResource>();

        for (TrainingSeason trainingSeason : trainingSeasons){
            resource.add(this.toResource(trainingSeason));
        }

        return resource;
    }
}
