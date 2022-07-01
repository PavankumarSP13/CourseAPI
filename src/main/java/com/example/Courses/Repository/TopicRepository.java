package com.example.Courses.Repository;


import com.example.Courses.Model.TopicDAO;
import com.example.Courses.Model.TopicDTO;
import org.springframework.data.repository.CrudRepository;


public interface TopicRepository extends CrudRepository<TopicDAO, String> {

    TopicDAO findById(int id);

    Iterable<TopicDAO> findAll();




    TopicDTO deleteById(TopicDAO topicDAO);
}
