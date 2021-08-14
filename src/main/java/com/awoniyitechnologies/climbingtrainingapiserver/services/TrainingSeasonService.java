package com.awoniyitechnologies.climbingtrainingapiserver.services;

import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.models.TrainingSeason;
import com.awoniyitechnologies.climbingtrainingapiserver.repositories.TrainingSeasonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TrainingSeasonService {
    
    private TrainingSeasonRepository trainingSeasonRepository;
    private DaySessionService daySessionService;

    @Autowired
    public TrainingSeasonService(TrainingSeasonRepository trainingSeasonRepository,
            DaySessionService daySessionService) {
        this.trainingSeasonRepository = trainingSeasonRepository;
        this.daySessionService = daySessionService;
    }

    public List<TrainingSeason> getAllTrainingSeasons() {
        return trainingSeasonRepository.findAll();
    }

    public TrainingSeason createTrainingSeason(TrainingSeason trainingSeason) {
        // create 84 day sessions
        return trainingSeasonRepository.saveAndFlush(trainingSeason);
    }
}
