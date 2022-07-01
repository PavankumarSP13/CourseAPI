package com.example.Courses.Services;

import com.example.Courses.Converter.TopicConverter;
import com.example.Courses.Exceptions.ResponseTopic;
import com.example.Courses.Model.TopicDAO;
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
        List<TopicDAO> topicDAOS = new ArrayList<>();
        topicRepository.findAll().forEach(topicDAOS::add);//It's in Java 8, Convert it into Java 7
        return topicConverter.entityToDto(topicDAOS);
    }

    public TopicDTO getTopic(int id) {
         TopicDAO topicDAO=topicRepository.findById(id);
         return topicConverter.entityToDto(topicDAO);
}


    public TopicDTO addTopic(TopicDTO topicDTO)
    {
        TopicDAO topicDAO = topicConverter.dtoToEntity(topicDTO);
        topicRepository.save(topicDAO);
        return  topicConverter.entityToDto(topicDAO);
    }


    public TopicDTO updateTopic(int id, TopicDTO topicDTO)
    {
        TopicDAO topicDAO = topicConverter.dtoToEntity(topicDTO);
        topicRepository.save(topicDAO);
        return topicConverter.entityToDto(topicDAO);
    }

    public void updateTopicPartial(int id, String name)
    {
         TopicDAO topicDAO = topicRepository.findById(id);
         topicDAO.setName(name);
         topicRepository.save(topicDAO);

    }


//    public ResponseTopic<TopicDTO> deleteTopic(int id) {
//        ResponseTopic<TopicDTO> response = new ResponseTopic<>();
//        Optional<TopicDAO> db = Optional.of((topicRepository.findById(id)));
//        if (db.isPresent()) {
//            TopicDTO t = new TopicDTO(db.get());
//            response.setBody(t);
//            response.setMessage("Topic Details deleted for id: " + id);
//            response.setStatus(200);
//            topicRepository.deleteById(id);
//        } else {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TopicID Not Found in DB.");
//        }
//        return response;

//    }

    public TopicDTO deleteTopic(int id,TopicDTO topicDTO) {
        TopicDAO topicDAO = topicConverter.dtoToEntity(topicDTO);
        topicRepository.deleteById(topicDAO);
        return topicConverter.entityToDto(topicDAO);
    }
}
