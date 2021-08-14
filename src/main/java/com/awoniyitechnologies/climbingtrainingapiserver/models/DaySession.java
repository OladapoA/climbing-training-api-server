package com.awoniyitechnologies.climbingtrainingapiserver.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "day_sessions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DaySession {
    enum WorkoutType {TRAINING_SESSION_ONE, TRAINING_SESSION_TWO, CORE_CARDIO,
    GYM_OUTDOOR}
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Timestamp date;
    // private String workout;
    private String workoutType;
    private Boolean status;

    @OneToOne
    // @JoinColumn(name="training_season_id")
    private TrainingSeason trainingSeason;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Timestamp getDate() { return date; }
    public void setDate(Timestamp date) { this.date = date; }

    public Boolean getStatus() { return status; }
    public void setStatus(Boolean status) { this.status = status; }

    // public WorkoutType getWorkout() { return WorkoutType.valueOf(workout); }
    // public void setWorkout(WorkoutType workout) { this.workout = workout.name(); }

    public String getWorkoutType() { return workoutType; }
    public void setWorkoutType(String workoutType) { this.workoutType = workoutType; }

    public TrainingSeason getTrainingSeason() { return trainingSeason; }
    public void setTrainingSeason(TrainingSeason trainingSeason) { this.trainingSeason = trainingSeason; }
}
