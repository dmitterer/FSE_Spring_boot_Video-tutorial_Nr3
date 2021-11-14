package com.itkollegimst.spring.data.jpa.tutorial.repository;

import com.itkollegimst.spring.data.jpa.tutorial.entity.Course;
import com.itkollegimst.spring.data.jpa.tutorial.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTecher(){

        Course courseDBI = Course.builder()
                .title("DBI")
                .credit(4)
                .build();

        Course courseCOPR = Course.builder()
                .title("COPR")
                .credit(3)
                .build();

        Teacher teacher =
                Teacher.builder()
                        .firstName("Michael")
                        .lastName("Gamper")
                       // .courses((List.of(courseDBI, courseCOPR)))
                        .build();


        teacherRepository.save(teacher);
   }
}