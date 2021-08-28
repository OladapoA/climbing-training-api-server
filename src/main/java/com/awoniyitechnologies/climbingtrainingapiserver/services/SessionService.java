package com.awoniyitechnologies.climbingtrainingapiserver.services;

import java.util.Arrays;
import java.util.List;

import com.awoniyitechnologies.climbingtrainingapiserver.models.DaySession;
import com.awoniyitechnologies.climbingtrainingapiserver.models.Session;
import com.awoniyitechnologies.climbingtrainingapiserver.models.SessionExercise;
import com.awoniyitechnologies.climbingtrainingapiserver.repositories.SessionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SessionService {
    private SessionRepository sessionRepository;
    private SessionExerciseService sessionExerciseService;

    @Autowired
    public SessionService(SessionRepository sessionRepository, SessionExerciseService sessionExerciseService) {
        this.sessionRepository = sessionRepository;
        this.sessionExerciseService = sessionExerciseService;
    }

    public List<Session> getAllSessions() {
        return sessionRepository.findAll();
    }

    public Session getSession(Long id) {
        return sessionRepository.getById(id);
    }

    // public void createWeekSessions(List<DaySession> weekDaySessions) {
    //     List<Long> weekSchedule = Arrays.asList(1L, 3L, 2L, 4L, 5L, 6L, 3L);
    //     for (DaySession weekDaySession : weekDaySessions) {
    //     }
    // }

    public void createWeekSessions(List<Session> weekSessionsTemplateList, List<DaySession> weekDaySessions) {
        for (int i = 0; i < 7; i++) {
            DaySession daySession = weekDaySessions.get(i);
            Session sessionTemplate = weekSessionsTemplateList.get(i);
            Session newSession = new Session();
            newSession.setDaySession(daySession);
            newSession.setName(sessionTemplate.getName());
            newSession.setTime(sessionTemplate.getTime());
            newSession.setDescription(sessionTemplate.getDescription());
            newSession.setTemplate(false);
            Session savedSession = sessionRepository.saveAndFlush(newSession);
            sessionExerciseService.copyTemplateToSession(savedSession, sessionTemplate.getSessionExercises());
        }
    }

    public void createSeasonSessions(List<Session> weekSessionsTemplateList, List<List<DaySession>> SeasonDaySessions,
            List<Session> restWeekSessionsTemplateList) {
        for (int i = 0 ; i < 12 ; i++) {
            if (i == 5 || i == 11){
                createWeekSessions(restWeekSessionsTemplateList, SeasonDaySessions.get(i));
            } else {
                createWeekSessions(weekSessionsTemplateList, SeasonDaySessions.get(i));
            }
        }
    }

    public void updateSessionStatus(Session session) {
        List<SessionExercise> sessionExercises = session.getSessionExercises();
        Boolean status = true;
        for (SessionExercise sessionExercise : sessionExercises) {
            if (sessionExercise.getStatus() != null && sessionExercise.getStatus().equals(false)){
                status = false;
                break;
            }
        }
        session.setStatus(status);
        sessionRepository.saveAndFlush(session);
    }
}
