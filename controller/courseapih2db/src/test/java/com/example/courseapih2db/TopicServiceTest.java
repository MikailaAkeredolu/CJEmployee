package com.example.courseapih2db;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
/*
When we annotate a test class with @RunWith or extend a @RunWith class, during test execution, the built-in JUnit4 runner is ignored.
 Instead, JUnit uses the runner that it references in the @RunWith argument.
 */
@RunWith(MockitoJUnitRunner.class)

public class TopicServiceTest {


    @InjectMocks
    private TopicService service;  //mock service

    @Mock
    private TopicRepository repository;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);  //intitialize our mocks
    }


    @Test
    public void getAllTopics() throws Exception{
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

       // Verify that the service was called at least once
        Mockito.verify(repository, Mockito.times(1)).findAll();
    }

    @Test
    public void getTopic() throws Exception {
        //Arrange mock behavior
        Topic topic = new Topic(4L,"topic four", "topic four description");
        service.addTopic(topic);

        //Act -performing the the request
        Mockito.when(repository.findOne(4L)).thenReturn(topic);

        //Assert
        assertEquals(service.getTopic(4L), topic);

        //make sure find was called only once
        Mockito.verify(repository, Mockito.times(1)).findOne(4L);
    }

    @Test
    public void addTopic() throws Exception{
        //Arrange mock behavior
        Topic topic = new Topic(5L,"topic three", "topic three description");
        service.addTopic(topic);
        Mockito.when(repository.save(topic)).thenReturn(topic);
       // assertEquals(service.getTopic(topic.getId()), topic);
        assertEquals(topic.getId(), null);
        Mockito.verify(repository, Mockito.times(1)).save(topic);

    }

    @Test
    public void updateTopic() throws Exception {
    }

    @Test
    public void deleteTopic() throws Exception {

        Topic topic = new Topic(7L,"topic four", "topic four description");
        System.out.println(topic);
        repository.delete(7L);
        Mockito.when(repository.findOne(7L)).thenReturn(null);
        assertEquals( topic.getId(), null);
        Mockito.verify(repository, Mockito.times(1)).delete(topic);
    }


}