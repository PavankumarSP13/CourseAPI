package com.example.Courses.Controllers;

import com.example.Courses.Converter.TopicConverter;
import com.example.Courses.Model.Topic;
import com.example.Courses.Model.TopicDTO;
import com.example.Courses.Services.TopicService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private TopicConverter topicConverter;

    @GetMapping("/topics")
    public List<TopicDTO> getAllTopics()
    {
        return topicService.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public TopicDTO getTopic(@PathVariable int id)
    {
        return topicService.getTopic(id);
    }

    @PostMapping("/topics")
    public TopicDTO addTopic(@RequestBody Topic topic)
    {
        return topicService.addTopic(topic);
    }

    @PutMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable int id)
    {
        topicService.updateTopic(id,topic);
    }

    @PatchMapping ("/topics/{id}/{name}")
    public void updateTopicPartial(@RequestBody Topic topic,@PathVariable int id,@PathVariable String name)
    {
        topicService.updateTopicPartial(id,topic,name);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable int id)
    {
         topicService.deleteTopic(id);
    }
}
