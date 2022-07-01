//package com.example.Courses.Model;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//
//@Entity
//public class Course {
//
//    @Id
//    private String id;
//    private String name;
//    private String description;
//
//    @ManyToOne
//    private TopicDAO topicDAO;
//
//    public Course()
//    {
//       super();
//    }
//
//    public Course(String id, String name, String description, String topicId) {
//        super();
//        this.id = id;
//        this.name = name;
//        this.description = description;
////       this.topicDAO = new TopicDAO(topicId,"","");
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public TopicDAO getTopicDAO() {
//        return topicDAO;
//    }
//
//    public void setTopicDAO(TopicDAO topicDAO) {
//        this.topicDAO = topicDAO;
//    }
//}
//
//
//
