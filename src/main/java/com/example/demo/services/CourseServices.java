package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controllers.Course;
import com.example.demo.database.courseData;
@Service
public class CourseServices {
    @Autowired
    private courseData courseData;
    List<Course> list;
    public CourseServices()
    {
        list = new ArrayList<>();
        list.add(new Course(1, "JAVA", "java beginner course"));
        list.add(new Course(2, "C++", "c++ beginner course"));
    } 
    public List<Course> getCourses() {
        return courseData.findAll();
    }
    public Course getCourse(Long courseId) {
        return courseData.getReferenceById(courseId);
    }
    public Course addCourse(Course course) {
        // list.add(course);
        courseData.save(course);
        return course;
    }
    public Course deleteCourse(Long courseId) {
        // Course course = null;
        // for(Course c : list)
        // {
        //     if(c.getId()==courseId)
        //     {
        //         course=c;
        //         list.remove(c);
        //         break; 
        //     }
        // }
        Course entity = courseData.getReferenceById(courseId);
        courseData.delete(entity);
        return entity;
    }
    public Course updateCourse(long courseId,Course course) {
        // for(Course c : list)
        // {
        //     if(c.getId()==courseId)
        //     {
        //         list.remove(c);
        //         list.add(course);
        //         break;
        //     }
        // }
        // return course;
        courseData.save(course);
        return course;
    }
}
