package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.controllers.Course;
@Service
public class CourseServices {
    List<Course> list;
    public CourseServices()
    {
        list = new ArrayList<>();
        list.add(new Course(1, "JAVA", "java beginner course"));
        list.add(new Course(2, "C++", "c++ beginner course"));
    } 
    public List<Course> getCourses() {
        return list;
    }
    public Course getCourse(long courseId) {
        Course c = null;
        for(Course course : list)
        {
            if(course.getId()==courseId)
            {
                c = course;
                break;
            }
        }
        return c;
    }
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }
    public Course deleteCourse(Long courseId) {
        Course course = null;
        for(Course c : list)
        {
            if(c.getId()==courseId)
            {
                course=c;
                list.remove(c);
                break;
            }
        }
        return course;
    }
    public Course updateCourse(long courseId,Course course) {
        for(Course c : list)
        {
            if(c.getId()==courseId)
            {
                list.remove(c);
                list.add(course);
                break;
            }
        }
        return course;
    }
}
