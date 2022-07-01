package com.example.Courses.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class TopicDAO{

        @Id // Id shouls be automatically generated
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;

        private String name;
        private String description;


}



