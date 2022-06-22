package com.example.demo.Services;

import com.example.demo.Model.Topic;
import com.example.demo.Repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

//    private List <Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("1","SpringBoot","SB Desc"),
//            new Topic("2","Java","Java Desc"),
//            new Topic("3","JS","JavaScript Desc")
//    ));

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
       return topicRepository.findById(id).orElse(null);
        //return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();

   }


    public void addTopic(Topic topic)
    {
        topicRepository.save(topic);
    }

    public void updateTopic( String id,Topic topic ) {
//        for (int i = 0; i < topics.size(); i++) {
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)) {
//                topics.set(i, topic);
//                return;
//            }
//        }
        topicRepository.save(topic);
    }

    public void deleteTopic(String id)
    {
      //topics.removeIf(t->t.getId().equals(id));
        topicRepository.deleteById(id);
    }
}