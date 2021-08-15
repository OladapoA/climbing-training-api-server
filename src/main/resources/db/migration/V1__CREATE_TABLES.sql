-- CREATE SCHEMA IF NOT EXISTS migrations;

CREATE TABLE public.exercises
(
    id     SERIAL PRIMARY KEY,
    type  varchar(30) NOT NULL,
    subtype   varchar(30) NOT NULL,
    name    varchar(30) NOT NULL,
    bookpage    int,
    beginner   boolean,
    intermediate boolean,
    advanced    boolean,
    sets int,
    reps int,
    time time,
    description text
);

CREATE TABLE public.sessions
(
    id     SERIAL PRIMARY KEY,
    time  time,
    status  boolean,
    name varchar(30) NOT NULL,
    description text,
    template boolean
);

CREATE TABLE public.session_exercises
(
    id     SERIAL PRIMARY KEY,
    name varchar(30) NOT NULL,
    status  boolean,
    notes text,
    weight_target int,
    weight_used int,
    rep_target int,
    rep_used int,
    exercise_id   int REFERENCES exercises (id),
    session_id   int NOT NULL REFERENCES sessions (id),
    template boolean,
    time time
);

CREATE TABLE public.training_session_ones
(
    id     SERIAL PRIMARY KEY,
    warm_up   int REFERENCES session_exercises (id),
    isolation_one   int REFERENCES session_exercises (id),
    isolation_two   int REFERENCES session_exercises (id),
    isolation_three   int REFERENCES session_exercises (id),
    climbing   int REFERENCES session_exercises (id),
    core   int REFERENCES session_exercises (id),
    cool_down   int REFERENCES session_exercises (id),
    total_time  time,
    status  boolean
);

CREATE TABLE public.training_session_twos
(
    id     SERIAL PRIMARY KEY,
    warm_up   int REFERENCES session_exercises (id),
    climbing_one   int REFERENCES session_exercises (id),
    climbing_two   int REFERENCES session_exercises (id),
    climbing_three   int REFERENCES session_exercises (id),
    core   int REFERENCES session_exercises (id),
    cool_down   int REFERENCES session_exercises (id),
    total_time  time,
    status  boolean
);

CREATE TABLE public.core_cardio_sessions
(
    id     SERIAL PRIMARY KEY,
    warm_up   int REFERENCES session_exercises (id),
    core_one   int REFERENCES session_exercises (id),
    core_two   int REFERENCES session_exercises (id),
    cardio_one   int REFERENCES session_exercises (id),
    cardio_two   int REFERENCES session_exercises (id),
    total_time  time,
    status  boolean
);

CREATE TABLE public.gym_outdoor_sessions
(
    id     SERIAL PRIMARY KEY,
    exercise   int REFERENCES session_exercises (id),
    status  boolean
);

CREATE TABLE public.training_seasons
(
    id     SERIAL PRIMARY KEY,
    start_date   date,
    status   boolean
);

CREATE TABLE public.day_sessions
-- CREATE TABLE IF NOT EXISTS migrations.users
(
    id     SERIAL PRIMARY KEY,
    date   date,
    workout_type varchar(30), -- need to change to enum
    training_season_id  int REFERENCES training_seasons (id),
    status   boolean
);