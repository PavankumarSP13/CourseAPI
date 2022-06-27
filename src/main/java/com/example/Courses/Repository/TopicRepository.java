package com.example.Courses.Repository;


import com.example.Courses.Model.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;



public interface TopicRepository extends CrudRepository<Topic, String> {

    Topic findById(int id);

    Iterable<Topic> findAll();


   void deleteById(int id);
}
