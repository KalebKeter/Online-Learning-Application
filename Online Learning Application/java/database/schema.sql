
BEGIN TRANSACTION;
DROP TABLE IF EXISTS users, courses, homework CASCADE;
CREATE TABLE users (
	user_id serial,
	username varchar(50) NOT NULL UNIQUE,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
	
);
CREATE TABLE courses (
	course_id serial,
	user_id int,
    	course_name varchar(64),
	course_description varchar(100),
	difficulty_level varchar(24) CHECK (difficulty_level IN ('1','2','3','4','5')),
	price integer,
	start_date varchar(12),
	end_date varchar(12),
	lesson_name text,
	reading text,
	homework_problem text,
    CONSTRAINT pk_course_id PRIMARY KEY (course_id)
);
CREATE TABLE homework (
	homework_id serial,
	course_id int,
	user_id int NOT NULL,
	user_name varchar(20),
	user_answer text,
	graded_status varchar(12),
	instructor_comments text,
    CONSTRAINT pk_homework PRIMARY KEY (homework_id)
);
ALTER TABLE courses
ADD CONSTRAINT fk_courses_users FOREIGN KEY (user_id) REFERENCES users(user_id);
ALTER TABLE homework
ADD CONSTRAINT fk_homework_courses FOREIGN KEY (course_id) REFERENCES courses(course_id);
COMMIT TRANSACTION;