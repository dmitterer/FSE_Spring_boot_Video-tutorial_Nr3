package com.itkollegimst.spring.data.jpa.tutorial.repository;


import com.itkollegimst.spring.data.jpa.tutorial.entity.Guardian;
import com.itkollegimst.spring.data.jpa.tutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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
                .build();


        studentRepository.save(student);

    }

    @Test
    public void saveStudentWithGuardian(){

        Guardian guardian = Guardian.builder()

                .email("Martha50Mayer@gmail.com")
                .name("Martha")
                .mobile("+43 664 1928 7755")
                .build();

        Student student = Student.builder()
                .firstName("Franz")
                .emailId("franz.m@gmail.com")
                .lastName("Mayr")
                .guardian(guardian)
                .build();
        studentRepository.save(student);

    }

    @Test
    public void printAllStudent(){

        List<Student> studentList =
                studentRepository.findAll();


        System.out.println("studentList" + studentList);


    }

    @Test
    public void printStudentByFirstName(){

    List<Student> students =
            studentRepository.findByFirstName("Franz");

        System.out.println("students = " + students);



    }

   @Test
   public void printStudentByFirstNameContaining() {

       List<Student> students =
               studentRepository.findByFirstNameContaining("Fr");

       System.out.println("students = " + students);

   }

   @Test
   public void printStudentBasedOnGuardianName() {

       List<Student> students =
               studentRepository.findByGuardianName("Martha");

       System.out.println("students = " + students);

   }
}