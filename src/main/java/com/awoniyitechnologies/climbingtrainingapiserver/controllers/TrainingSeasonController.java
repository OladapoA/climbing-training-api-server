package com.awoniyitechnologies.climbingtrainingapiserver.controllers;

import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.media.TrainingSeasonResource;
import com.awoniyitechnologies.climbingtrainingapiserver.media.TrainingSeasonResourceBuilder;
import com.awoniyitechnologies.climbingtrainingapiserver.models.Session;
import com.awoniyitechnologies.climbingtrainingapiserver.models.TrainingSeason;
import com.awoniyitechnologies.climbingtrainingapiserver.services.TrainingSeasonService;
import com.awoniyitechnologies.climbingtrainingapiserver.services.WeekSessionsTemplateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    private WeekSessionsTemplateService weekSessionsTemplateService;

    @Autowired
    public TrainingSeasonController(TrainingSeasonService trainingSeasonService,
            TrainingSeasonResourceBuilder trainingSeasonResourceBuilder, 
            WeekSessionsTemplateService weekSessionsTemplateService) {
        this.trainingSeasonService = trainingSeasonService;
        this.trainingSeasonResourceBuilder = trainingSeasonResourceBuilder;
        this.weekSessionsTemplateService = weekSessionsTemplateService;
    }

    // TODO: Maybe change this to be return some sort of summary, rather than all the data
    @GetMapping
    public List<TrainingSeasonResource> getAllTrainingSeasons() {
        List<TrainingSeason> trainingSeasons = trainingSeasonService.getAllTrainingSeasons();
        return trainingSeasonResourceBuilder.toResource(trainingSeasons);
    }

    @GetMapping
    @RequestMapping("{id}")
    public TrainingSeasonResource getExercise(@PathVariable Long id) {
        TrainingSeason trainingSeasons = trainingSeasonService.getTrainingSeason(id);
        return trainingSeasonResourceBuilder.toResource(trainingSeasons);
    }

    @PostMapping
    @RequestMapping("templateId/{templateId}")
    @ResponseStatus(HttpStatus.CREATED)
    public TrainingSeasonResource createTrainingSeason(@PathVariable Long templateId, @RequestBody TrainingSeason trainingSeason) {
        List<Session> restWeekSessionsTemplateList = weekSessionsTemplateService.getWeekSessionsTemplateList("Rest Week");
        List<Session> weekSessionsTemplateList = weekSessionsTemplateService.getWeekSessionsTemplateList(templateId);
        TrainingSeason newTrainingSeason = trainingSeasonService.createTrainingSeason(weekSessionsTemplateList, trainingSeason, restWeekSessionsTemplateList);
        return trainingSeasonResourceBuilder.toResource(newTrainingSeason);
    }
    
}
