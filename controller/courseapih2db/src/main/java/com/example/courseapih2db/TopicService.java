package com.example.courseapih2db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service

public class TopicService {
//     private  List<Topic> topics =  new ArrayList<>(Arrays.asList(
//             new Topic("spring", "Spring Framework", "SpringFrameWork Description" ),
//             new Topic("java","Core Java", " Core Java Description")
//     ));
    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(Long id){
       return topicRepository.findOne(id);
    }

//    public boolean exists(Long id) {
//        return getTopic(id) != null;
//    }

    public void addTopic(Topic t){
       topicRepository.save(t);
    }

    public void updateTopic(Long id, Topic topic){
        topicRepository.save(topic);
    }


    public void deleteTopic(Long id) {
      topicRepository.delete(id);

    }
}