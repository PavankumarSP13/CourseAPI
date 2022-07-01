package com.example.Courses.Controllers;

import com.example.Courses.Converter.TopicConverter;
//import com.example.Courses.Exceptions.EmptyInputException;
import com.example.Courses.Exceptions.ResponseTopic;
import com.example.Courses.Model.TopicDTO;
import com.example.Courses.Services.TopicService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
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
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<TopicDTO>> getAllTopics() {
        return new ResponseEntity<>(topicService.getAllTopics(), HttpStatus.OK);

    }

    @GetMapping("/topics/{id}")
    public ResponseEntity<TopicDTO> getTopic(@PathVariable int id) {
        return new ResponseEntity<>(topicService.getTopic(id), HttpStatus.OK);
    }

    @PostMapping("/topics")
    public ResponseEntity<TopicDTO> addTopic(@RequestBody TopicDTO topicDTO) {
        topicService.addTopic(topicDTO);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(responseHeaders, HttpStatus.CREATED);
    }

    @PutMapping("/topics/{id}")
    public ResponseEntity<TopicDTO> updateTopic(@RequestBody TopicDTO topicDTO, @PathVariable int id) {
        topicService.updateTopic(id, topicDTO);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(topicDTO, responseHeaders, HttpStatus.OK);
    }

//    @PatchMapping ("/topics/{id}/{name}")
//    public void updateTopicPartial(@RequestBody TopicDAO topic,@PathVariable int id,@PathVariable String name)
//    {
//        topicService.updateTopicPartial(id,topic,name);
//    }

    @PatchMapping("/topics/{id}/{name}")
    public ResponseEntity<TopicDTO> updatePartialTopic(@PathVariable int id, @PathVariable String name) {
        topicService.updateTopicPartial(id, name);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(responseHeaders, HttpStatus.OK);
    }

    @DeleteMapping("/topics/{id}")
    public TopicDTO delete(@PathVariable int id,TopicDTO topicDTO) {
        return topicService.deleteTopic(id,topicDTO);

    }
}
