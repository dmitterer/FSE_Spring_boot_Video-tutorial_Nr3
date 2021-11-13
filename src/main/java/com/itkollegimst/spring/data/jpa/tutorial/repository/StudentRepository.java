package com.itkollegimst.spring.data.jpa.tutorial.repository;

import com.itkollegimst.spring.data.jpa.tutorial.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository <Student,Long>{


    public List<Student> findByFirstName(String firstName);
}
