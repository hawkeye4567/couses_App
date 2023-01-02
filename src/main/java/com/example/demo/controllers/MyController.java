package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.CourseServices;

@RestController
public class MyController {
    @Autowired
    private CourseServices courseServices;
    @GetMapping("/home")
    public String home() {
        return "this is home page";
    }
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseServices.getCourses();
        
    }
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return this.courseServices.getCourse(Long.parseLong(courseId));

    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.courseServices.addCourse(course);

    }
    @DeleteMapping("/courses/{courseId}")
    public Course addCourse(@PathVariable String courseId) {
        return this.courseServices.deleteCourse(Long.parseLong(courseId));

    }
    @PutMapping("/courses/{courseId}")
    public Course updateCourse(@PathVariable String courseId,@RequestBody Course course) {
        return this.courseServices.updateCourse(Long.parseLong(courseId),course);

    }
}
