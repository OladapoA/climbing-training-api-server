-- TRAINING SESSIONS
INSERT INTO training_seasons (start_date, status) VALUES ('2022-02-18', 'FALSE');

-- INSERT INTO DAY SESSIONS
INSERT INTO day_sessions (date, workout_type, training_season_id, status) VALUES ('2022-02-18', 'TRAINING_SESSION_ONE', 1, 'FALSE');

INSERT INTO exercises (type, subtype, name) VALUES ('test', 'test', 'test');
INSERT INTO exercises (type, subtype, name, bookpage, beginner, intermediate, advanced, sets, reps, time, description) VALUES ('Warm up / cool down', 'Full body', 'Simple Sun Salutations', 61, 'TRUE', 'TRUE', 'TRUE', 0, 0, 'T0:02:00', 'Begin standing straight with hands at side. 
Raise arms out to side and above head, stretching back. 
With a straight back, reach out and down, touching toes. 
Straight back and open chest, allowing yourself to rise up a little. 
Reach back down to toes, place hands on floor, and step back into a plank. 
Drop into a push up and then push chest upwards into upward dog. 
Reverse movement back into push up and then push back into downward dog. 
Step feet forward again, coming into a doubled over position. 
Raise arms out and up as you straighten your back.  
Return to starting position, and repeat. ');

-- SESSIONS
-- INSERT INTO exercises (time, status, name, description, template)
INSERT INTO sessions (time, name, description, template) VALUES ('3:00:00', 'Training Session 1', 'The focus of the first training session of the week is exercises that isolate certain climbing specific-muscles or movements.', 'TRUE');
INSERT INTO sessions (time, name, description, template) VALUES ('3:00:00', 'Training Session 2', 'The focus of the second training session of the week is on climbing and exercises that use the wall.', 'TRUE');
INSERT INTO sessions (time, name, description, template) VALUES ('1:00:00', 'Core and Cardio', 'This is a brief workout focusing on Cardio and Core exercises. The length should be 30-60 minutes, and you should avoid any exercises that use your arms or back muscles, paying special attention to letting the forearms rest.', 'TRUE');
INSERT INTO sessions (time, name, description, template) VALUES ('1:00:00', 'Rest', 'Rest', 'TRUE');
INSERT INTO sessions (time, name, description, template) VALUES ('1:00:00', 'Outdoor/Gym', 'Just a basic outdoor or indoor session. Have fun!', 'TRUE');

-- SESSION EXERCISES
-- INSERT INTO session_exercises (name, status, notes, weight_target, weight_used, rep_target, rep_used, exercise_id, session_id, template)
INSERT INTO session_exercises (name, session_id, template) VALUES ('Warm Up', 1, 'TRUE');
INSERT INTO session_exercises (name, session_id, template) VALUES ('Isolation 1', 1, 'TRUE');
INSERT INTO session_exercises (name, session_id, template) VALUES ('Isolation 2', 1, 'TRUE');
INSERT INTO session_exercises (name, session_id, template) VALUES ('Isolation 3', 1, 'TRUE');
INSERT INTO session_exercises (name, session_id, template) VALUES ('Climbing', 1, 'TRUE');
INSERT INTO session_exercises (name, session_id, template) VALUES ('Core', 1, 'TRUE');
INSERT INTO session_exercises (name, session_id, template) VALUES ('Cool Down', 1, 'TRUE');