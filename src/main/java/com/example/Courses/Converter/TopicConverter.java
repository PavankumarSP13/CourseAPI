package com.example.Courses.Converter;


import com.example.Courses.Model.TopicDAO;
import com.example.Courses.Model.TopicDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TopicConverter
{
    public TopicDTO entityToDto(TopicDAO topicDAO) {
        return TopicDTO.builder().id(topicDAO.getId()).name(topicDAO.getName()).description(topicDAO.getDescription()).build();
    }

    public List<TopicDTO> entityToDto(List<TopicDAO> topicDAO) {
        return topicDAO.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
    }


    public TopicDAO dtoToEntity(TopicDTO dto) {
         return TopicDAO.builder().id(dto.getId()).name(dto.getName()).description(dto.getDescription()).build();
       
    }

    public List<TopicDAO> dtoToEntity(List<TopicDTO> dto) {
        return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
    }

}