package com.example.demo.Services;

import com.example.demo.Model.Course;
import com.example.demo.Repository.CourseRepository;
import com.example.demo.Repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id) {
        return courseRepository.findById(id).orElse(null);
        //return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {

        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        //topics.removeIf(t->t.getId().equals(id));
        courseRepository.deleteById(id);
    }

}