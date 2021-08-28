-- TRAINING SEASON
-- INSERT INTO training_seasons (start_date, status)
INSERT INTO training_seasons (start_date, status) VALUES ('2022-02-18', 'FALSE');

-- DAY SESSIONS
-- INSERT INTO day_sessions (date, training_season_id, status)
INSERT INTO day_sessions (date, training_season_id, status) VALUES ('2022-02-18', 1, 'FALSE'); -- Delete workout type

-- EXERCISES
-- INSERT INTO exercises (type, subtype, name, bookpage, beginner, intermediate, advanced, sets, reps, time, description)
INSERT INTO exercises (type, subtype, name, bookpage, beginner, intermediate, advanced, sets, reps, time, description) VALUES ('Warm up / cool down', 'Full body', 'Simple Sun Salutations', 61, 'TRUE', 'TRUE', 'TRUE', 0, 0, 'T0:02:00', 'Begin standing straight with hands at side. Raise arms out to side and above head, stretching back. With a straight back, reach out and down, touching toes. Straight back and open chest, allowing yourself to rise up a little. Reach back down to toes, place hands on floor, and step back into a plank. Drop into a push up and then push chest upwards into upward dog. Reverse movement back into push up and then push back into downward dog. Step feet forward again, coming into a doubled over position. Raise arms out and up as you straighten your back.  Return to starting position, and repeat.');

-- SESSIONS
-- INSERT INTO exercises (time, status, name, description, template, day_session_id)
INSERT INTO sessions (time, name, description, template) VALUES ('3:00:00', 'Training Session 1', 'The focus of the first training session of the week is exercises that isolate certain climbing specific-muscles or movements.', 'TRUE');
INSERT INTO sessions (time, name, description, template) VALUES ('3:00:00', 'Training Session 2', 'The focus of the second training session of the week is on climbing and exercises that use the wall.', 'TRUE');
INSERT INTO sessions (time, name, description, template) VALUES ('1:00:00', 'Core and Cardio', 'This is a brief workout focusing on Cardio and Core exercises. The length should be 30-60 minutes, and you should avoid any exercises that use your arms or back muscles, paying special attention to letting the forearms rest.', 'TRUE');
INSERT INTO sessions (name, description, template) VALUES ('Rest', 'Rest', 'TRUE');
INSERT INTO sessions (name, description, template) VALUES ('Outdoor/Gym', 'Just a basic outdoor or indoor session. Have fun!', 'TRUE');
INSERT INTO sessions (name, description, template) VALUES ('Outdoor/Gym or Fitness and Strength Session', 'This alternative to an Outdoor/Gym session is useful if you really wrecked yourself on Saturday and want to make sure your forearms are recovered for Training Session 1 or if your local outdoor spot annihilated your tips and you just can’t climb another day. It can also be useful time-wise, as it usually does not last as long as a normal climbing session. The focus should be on body-weight calisthenics rotations of HIIT-style lifting sessions utilizing low weights and high repetitions.', 'TRUE');

-- SESSION EXERCISES
-- INSERT INTO session_exercises (name, time ,status, notes, weight_target, weight_used, rep_target, rep_used, exercise_id, session_id, template)
-- Training Session 1
INSERT INTO session_exercises (name, time, session_id, template) VALUES ('Warm Up', '0:30:00', 1, 'TRUE');
INSERT INTO session_exercises (name, time, session_id, template) VALUES ('Isolation 1', '0:30:00', 1, 'TRUE');
INSERT INTO session_exercises (name, time, session_id, template) VALUES ('Isolation 2', '0:15:00', 1, 'TRUE');
INSERT INTO session_exercises (name, time, session_id, template) VALUES ('Isolation 3', '0:15:00', 1, 'TRUE');
INSERT INTO session_exercises (name, time, session_id, template) VALUES ('Climbing', '1:00:00', 1, 'TRUE');
INSERT INTO session_exercises (name, time, session_id, template) VALUES ('Core', '0:20:00', 1, 'TRUE');
INSERT INTO session_exercises (name, time, session_id, template) VALUES ('Cool Down', '0:10:00', 1, 'TRUE');
-- Training Session 2
INSERT INTO session_exercises (name, time, session_id, template) VALUES ('Warm Up', '0:30:00', 2, 'TRUE');
INSERT INTO session_exercises (name, time, session_id, template) VALUES ('Climbing 1', '0:50:00', 2, 'TRUE'); -- need to link to vmax exercise
INSERT INTO session_exercises (name, time, session_id, template) VALUES ('Climbing 2', '0:20:00', 2, 'TRUE');
INSERT INTO session_exercises (name, time, session_id, template) VALUES ('Climbing 3', '0:20:00', 2, 'TRUE');
INSERT INTO session_exercises (name, time, session_id, template) VALUES ('Core', '0:20:00', 2, 'TRUE');
INSERT INTO session_exercises (name, time, session_id, template) VALUES ('Cool Down', '0:10:00', 2, 'TRUE');
-- Core and Cardio
INSERT INTO session_exercises (name, time, session_id, template) VALUES ('Warm Up', '0:10:00', 3, 'TRUE');
INSERT INTO session_exercises (name, time, session_id, template) VALUES ('Cardio and Core', '0:45:00', 3, 'TRUE'); -- need to link to Cardio and Core exercise
INSERT INTO session_exercises (name, time, session_id, template) VALUES ('Cool Down', '0:5:00', 3, 'TRUE');
-- Rest
INSERT INTO session_exercises (name, session_id, template) VALUES ('Rest', 4, 'TRUE');
-- Outdoor/Gym
INSERT INTO session_exercises (name, session_id, template) VALUES ('Outdoor/Gym', 5, 'TRUE');
-- Outdoor/Gym
INSERT INTO session_exercises (name, session_id, template) VALUES ('Outdoor/Gym or Fitness and Strength Session', 6, 'TRUE');

-- WEEK SESSIONS TEMPLATE
-- INSERT INTO week_sessions_template (name, description, monday_session_id, tuesday_session_id, wednesday_session_id, thursday_session_id , friday_session_id, saturday_session_id, sunday_session_id) 
INSERT INTO week_sessions_template (name, description, monday_session_id, tuesday_session_id, wednesday_session_id, thursday_session_id , friday_session_id, saturday_session_id, sunday_session_id) values ('Rest Week', 'Week consisting of only rest sessions', 4, 4, 4, 4, 4, 4, 4);
INSERT INTO week_sessions_template (name, description, monday_session_id, tuesday_session_id, wednesday_session_id, thursday_session_id , friday_session_id, saturday_session_id, sunday_session_id) values ('Standard Week', 'weekly schedule following climbing 102', 3, 1, 3, 2, 4, 5, 6);
INSERT INTO week_sessions_template (name, description, monday_session_id, tuesday_session_id, wednesday_session_id, thursday_session_id , friday_session_id, saturday_session_id, sunday_session_id) values ('Alternate Week', 'One day shifted schedule of climbing 102 schedule', 1, 3, 2, 4, 5, 6, 3);

-- Dev data