package com.awoniyitechnologies.climbingtrainingapiserver.media;

import java.util.ArrayList;
import java.util.List;

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
        
        List<DaySessionResource> daySessionResources = daySessionResourceBuilder.toResource(trainingSeason.getDaySessions());
        resource.setDaySession(daySessionResources);

        // List<MuscleGroupResource> muscleGroupResources = new ArrayList<MuscleGroupResource>();
        // for (MuscleGroup muscleGroup : exercise.getMuscle_groups()){
        //     muscleGroupResources.add(muscleGroupResourceBuilder.toResource(muscleGroup));
        // }
        // resource.setMuscle_groups(muscleGroupResources);

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
