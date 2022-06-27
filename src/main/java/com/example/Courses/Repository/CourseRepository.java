package com.example.Courses.Repository;

import com.example.Courses.Model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {
    public List<Course> findByTopicId(String topicId);

}
