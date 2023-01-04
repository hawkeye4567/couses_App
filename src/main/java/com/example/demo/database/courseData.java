package com.example.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.controllers.Course;

public interface courseData extends JpaRepository<Course,Long>{
    
}
