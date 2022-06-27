package com.example.Courses.Services;

import com.example.Courses.Converter.TopicConverter;
import com.example.Courses.Model.Topic;
import com.example.Courses.Model.TopicDTO;
import com.example.Courses.Repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicRepository topicRepository;

    @Autowired
    private TopicConverter topicConverter;

    public List<TopicDTO> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);//It's in Java 8, Convert it into Java 7
        return topicConverter.entityToDto(topics);
    }

    public TopicDTO getTopic(int id) {
        Topic topic= topicRepository.findById(id);
        return topicConverter.entityToDto(topic);
        //return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }


    public TopicDTO addTopic(TopicDTO dto)
    {
        Topic topic = topicConverter.dtoToEntity(dto);
        topicRepository.save(topic);
        return topicConverter.entityToDto(topic);
    }

    public TopicDTO updateTopic(int id, TopicDTO dto )
    {
        Topic topic = topicConverter.dtoToEntity(dto);
        topicRepository.save(topic);
        return topicConverter.entityToDto(topic);
    }

    public TopicDTO updateTopicPartial(int id, TopicDTO dto, String name)
    {
        Topic topic = topicConverter.dtoToEntity(dto);
        topicRepository.save(topic);
        return topicConverter.entityToDto(topic);
    }

    public void deleteTopic(int id) {
        topicRepository.deleteById(id);

    }
}
