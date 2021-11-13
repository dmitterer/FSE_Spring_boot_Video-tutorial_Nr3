package com.itkollegimst.spring.data.jpa.tutorial.repository;


import com.itkollegimst.spring.data.jpa.tutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){

        Student student = Student.builder()
                .emailId("domi.mit98@gmail.com")
                .firstName("Dominik")
                .lastName("Mitterer")
                .guardianName("Josef")
                .guardianEmail("josef47@gmail.com")
                .guardianMobile("+43 699 1453 43434")
                .build();


        studentRepository.save(student);

    }

}