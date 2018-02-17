package com.example.courseapih2db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired  //Tell spring to inject the singleton - declare the dependency for service - needs dependency injection
    private TopicService topicService;

    //GET by Endpoint
    @RequestMapping("/topics")
    public List<Topic>getAllTopics(){  //return a list of Topic Class Objects
      return topicService.getAllTopics();  //singleton.serviceMethod()
    }

    @RequestMapping("/topics/{id}")  //whatever i am expecting as an argument becomes a variable in the path {}
    public Topic getTopic(@PathVariable Long id){  // String id = {id}
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
    }

    //Delete
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")  //whatever i am expecting as an argument becomes a variable in the path {}
    public void deleteTopic(@PathVariable Long id){  // String id = {id}
        topicService.deleteTopic(id);
    }



}


