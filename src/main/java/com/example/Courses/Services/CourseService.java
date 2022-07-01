//package com.example.Courses.Services;
//
//import com.example.Courses.Model.Course;
//import com.example.Courses.Repository.CourseRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class CourseService {
//
//    @Autowired
//    private CourseRepository courseRepository;
//
//    public List<Course> getAllCourses(String topicId) {
//        List<Course> courses = new ArrayList<>();
//        courseRepository.findByTopicId(topicId).forEach(courses::add);
//        return courses;
//    }
//
//    public Optional<Course> getCourse(String id) {
//        return courseRepository.findById(id);
//        //return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
//    }
//
//    public void addCourse(Course course) {
//        courseRepository.save(course);
//    }
//
//    public void updateCourse(Course course) {
//
//        courseRepository.save(course);
//    }
//
//    public void deleteCourse(String id) {
//        //topics.removeIf(t->t.getId().equals(id));
//        courseRepository.deleteById(id);
//    }
//
//}