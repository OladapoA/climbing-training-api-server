-- INSERT INTO training_seasons (id, start_date, status) VALUES (1, '2022-02-18', 'FALSE');
INSERT INTO training_seasons (start_date, status) VALUES ('2022-02-18', 'FALSE');

-- INSERT INTO day_sessions (date, type, training_season_id, status) VALUES ('2022-02-18', 'type 1', 1, 'FALSE');
-- INSERT INTO day_sessions (date, workout_type, status) VALUES ('2022-02-18', 'TRAINING_SESSION_ONE', 'FALSE');
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