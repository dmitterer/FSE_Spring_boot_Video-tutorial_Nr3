package com.itkollegimst.spring.data.jpa.tutorial.repository;

import com.itkollegimst.spring.data.jpa.tutorial.entity.Course;
import com.itkollegimst.spring.data.jpa.tutorial.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long> {
}