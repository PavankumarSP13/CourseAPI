package com.example.Courses.Services;

import com.example.Courses.Model.Topic;
import com.example.Courses.Model.TopicDTO;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface TopicService {

    List<TopicDTO> getAllTopics();

    TopicDTO getTopic(int id);

    TopicDTO addTopic(TopicDTO dto);

    TopicDTO updateTopic(int id, TopicDTO dto );

    TopicDTO updateTopicPartial(int id, TopicDTO dto, String name);

    void deleteTopic(int id);

}