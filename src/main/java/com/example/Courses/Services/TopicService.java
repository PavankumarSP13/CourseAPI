package com.example.Courses.Services;

import com.example.Courses.Exceptions.ResponseTopic;
import com.example.Courses.Model.TopicDTO;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface TopicService {

    List<TopicDTO> getAllTopics();

    TopicDTO getTopic(int id);

    TopicDTO addTopic(TopicDTO topicDTO);

    TopicDTO updateTopic(int id, TopicDTO topicDTO);

    void updateTopicPartial(int id, String name);

    TopicDTO deleteTopic(int id,TopicDTO topicDTO);


}