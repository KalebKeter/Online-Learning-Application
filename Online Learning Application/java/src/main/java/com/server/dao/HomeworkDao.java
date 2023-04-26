package com.techelevator.dao;

import com.techelevator.model.Homework;

import java.security.Principal;
import java.util.List;



public interface HomeworkDao {

        public List<Homework> displayUserGradeBook(Principal principal);
        public List<Homework> displayAllNeedsGradedToInstructor();

        void updateGradebookAsInstructor(Homework updatedHomework, int id);

        public boolean createGradebookForUser(Homework homework, Principal principal);

        public List<Homework> displayGradebookForAllCoursesCreatedByThisInstructor(Principal Principal);


    }

