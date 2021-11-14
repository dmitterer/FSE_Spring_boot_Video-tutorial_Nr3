package com.itkollegimst.spring.data.jpa.tutorial.repository;


import com.itkollegimst.spring.data.jpa.tutorial.entity.Course;
import com.itkollegimst.spring.data.jpa.tutorial.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printCourses(){

        List<Course> courses = courseRepository.findAll();

        System.out.println("courses = " + courses);

    }

    @Test
    public void saveCourseWithTeacher(){

        Teacher teacher = Teacher

                .builder()
                .firstName("Claudio")
                .lastName("Landerer")
                .build();


        Course course = Course

                .builder()
                .title("FSE")
                .credit(8)
                .teacher(teacher)
                .build();

        courseRepository.save(course);

    }

}