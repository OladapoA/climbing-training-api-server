package com.awoniyitechnologies.climbingtrainingapiserver.services;

import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.models.DaySession;
import com.awoniyitechnologies.climbingtrainingapiserver.models.TrainingSeason;
import com.awoniyitechnologies.climbingtrainingapiserver.repositories.DaySessionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DaySessionService {
    private DaySessionRepository daySessionRepository;

    @Autowired
    public DaySessionService(DaySessionRepository daySessionRepository) {
        this.daySessionRepository = daySessionRepository;
    }

    public List<DaySession> getAllDaySessions() {
        return daySessionRepository.findAll();
    }

    // public List<DaySession> createSeasonDaySessions(TrainingSeason trainingSeason) {
    public void createSeasonDaySessions(TrainingSeason trainingSeason) {
        // create 84 day sessions
        for (int i=0; i<84; i++) {
            DaySession newDaySession = new DaySession();
            newDaySession.setTrainingSeason(trainingSeason);
            // newDaySession.setDate(date);
            // newDaySession.setWorkoutType(workoutType);
        }
    }
}
