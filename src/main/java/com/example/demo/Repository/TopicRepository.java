package com.example.demo.Repository;


import com.example.demo.Model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
