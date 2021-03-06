package com.awoniyitechnologies.climbingtrainingapiserver.services;

import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.models.Session;
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

    public TrainingSeason getTrainingSeason(Long id) {
        return trainingSeasonRepository.getById(id);
    }

    public TrainingSeason createTrainingSeason(List<Session> weekSessionsTemplateList, TrainingSeason trainingSeason,
            List<Session> restWeekSessionsTemplateList) {
        // create 84 day sessions
        // TODO: verify that start date is a monday
        TrainingSeason createdTrainingSeason = trainingSeasonRepository.saveAndFlush(trainingSeason);
        daySessionService.createSeasonDaySessions(weekSessionsTemplateList, createdTrainingSeason, restWeekSessionsTemplateList);
        // TODO: return createdTrainingSeason after other components are created so it isn't empty?
        return createdTrainingSeason;
    }
}
