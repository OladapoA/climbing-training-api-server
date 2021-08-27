package com.awoniyitechnologies.climbingtrainingapiserver.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.models.DaySession;
import com.awoniyitechnologies.climbingtrainingapiserver.models.Session;
import com.awoniyitechnologies.climbingtrainingapiserver.models.TrainingSeason;
import com.awoniyitechnologies.climbingtrainingapiserver.repositories.DaySessionRepository;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DaySessionService {
    private DaySessionRepository daySessionRepository;
    private SessionService sessionService;

    @Autowired
    public DaySessionService(DaySessionRepository daySessionRepository, SessionService sessionService) {
        this.daySessionRepository = daySessionRepository;
        this.sessionService = sessionService;
    }

    public List<DaySession> getAllDaySessions() {
        return daySessionRepository.findAll();
    }

    public DaySession getDaySession(Long id) {
        return daySessionRepository.getById(id);
    }

    public void createSeasonDaySessions(List<Session> weekSessionsTemplateList, TrainingSeason trainingSeason,
            List<Session> restWeekSessionsTemplateList) {
        List<List<DaySession>> daySessionWeeks = new ArrayList<>();
        DateTime startDate = new DateTime(trainingSeason.getStartDate());
        for (int i=0; i<12; i++) {
            List<DaySession> daySessionWeek = new ArrayList<>();
            for (int j=0; j<7; j++) {
                DaySession newDaySession = new DaySession();
                newDaySession.setTrainingSeason(trainingSeason);
                Timestamp newDate = new Timestamp(startDate.plusDays((i*7)+j).getMillis());
                newDaySession.setDate(newDate);
                daySessionWeek.add(daySessionRepository.saveAndFlush(newDaySession));
            }
            daySessionWeeks.add(daySessionWeek);
        }
        sessionService.createSeasonSessions(weekSessionsTemplateList, daySessionWeeks, restWeekSessionsTemplateList);
    }

    public void updateDaySessionStatus(DaySession daySession) {
        List<Session> sessions = daySession.getSessions();
        Boolean status = true;
        for (Session session : sessions) {
            if (session.getStatus().equals(false)){
                status = false;
                break;
            }
        }
        daySession.setStatus(status);
        daySessionRepository.saveAndFlush(daySession);
    }
}
