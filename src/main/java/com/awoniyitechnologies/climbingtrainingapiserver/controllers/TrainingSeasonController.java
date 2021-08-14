package com.awoniyitechnologies.climbingtrainingapiserver.controllers;

import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.media.TrainingSeasonResource;
import com.awoniyitechnologies.climbingtrainingapiserver.media.TrainingSeasonResourceBuilder;
import com.awoniyitechnologies.climbingtrainingapiserver.models.TrainingSeason;
import com.awoniyitechnologies.climbingtrainingapiserver.services.TrainingSeasonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/training-seasons")
public class TrainingSeasonController {

    private TrainingSeasonService trainingSeasonService;
    private TrainingSeasonResourceBuilder trainingSeasonResourceBuilder;

    @Autowired
    public TrainingSeasonController(TrainingSeasonService trainingSeasonService,
            TrainingSeasonResourceBuilder trainingSeasonResourceBuilder) {
        this.trainingSeasonService = trainingSeasonService;
        this.trainingSeasonResourceBuilder = trainingSeasonResourceBuilder;
    }

    // Maybe change this to be return some sort of summary, rather than all the data
    @GetMapping
    public List<TrainingSeasonResource> getAllTrainingSeasons() {
        List<TrainingSeason> trainingSeasons = trainingSeasonService.getAllTrainingSeasons();
        return trainingSeasonResourceBuilder.toResource(trainingSeasons);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TrainingSeasonResource createTrainingSeason(@RequestBody TrainingSeason trainingSeason) {
        TrainingSeason newTrainingSeason = trainingSeasonService.createTrainingSeason(trainingSeason);
        return trainingSeasonResourceBuilder.toResource(newTrainingSeason);
    }
    
}
