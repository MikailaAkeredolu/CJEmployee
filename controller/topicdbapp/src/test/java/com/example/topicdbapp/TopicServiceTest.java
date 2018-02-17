package com.example.topicdbapp;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import  org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class) //use mockito runner
public class TopicServiceTest {

    @InjectMocks
    private TopicService service;  //mock service

    @Mock
    private TopicRepository repository;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllTopicsTest() throws Exception{
        //Arrange mock behavior
        List<Topic> topicList = Arrays.asList(
                new Topic(1L,"topic one", "topic one description"),
                new Topic(2L,"topic two", "topic two description"),
                new Topic(3L,"topic three", "topic three description")
        );
        //Act -performing the the request
        Mockito.when(repository.findAll()).thenReturn(topicList);
        List<Topic> topicsService = service.getAllTopics();
        //Assert
        assertEquals(topicsService.size(), 3);

    }

    @Test
    public void addTopic() throws Exception{
        List<Topic> topicList = new ArrayList<>();
        Topic actual = new Topic(3L,"topic three", "topic two description");
        topicList.add(actual);
       Mockito.when(repository.save(actual)).thenReturn(actual);
        service.addTopic(actual);
        assertEquals(repository.findOne(3L), actual);
      // assertEquals(repository.findOne(actual.getId()), actual);

    }



}