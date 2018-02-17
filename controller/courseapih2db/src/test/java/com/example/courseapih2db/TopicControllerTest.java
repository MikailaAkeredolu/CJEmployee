package com.example.courseapih2db;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import java.util.*;

import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@RunWith(MockitoJUnitRunner.class)  //Run Test with Spring Context
public class TopicControllerTest {

    private MockMvc mockMvc;  //field for mockmvc object

    @InjectMocks
    private TopicController controller;  //instance

    @Mock
    private TopicService service;  //mock service

//    @Mock
//    private TopicRepository repository;  //mock service

    @Before //initialize the mockmvc object and pass it the controller and build it
    public void setup(){
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void getAllTopics() throws Exception {
        try {
            mockMvc.perform(MockMvcRequestBuilders.get("/topics"))
                    .andExpect(MockMvcResultMatchers.status().isOk());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Mockito.verify(service).getAllTopics();
    }

    @Test
    public void getTopic() throws Exception {
        try{
            mockMvc.perform(MockMvcRequestBuilders.get("/topics/{id}",1))
                    .andExpect(MockMvcResultMatchers.status().isOk());
        }catch (Exception e){
            e.printStackTrace();
        }
        Mockito.verify(service).getTopic(1L);
    }

    @Test
    public void addTopic() throws Exception {
        Topic topic = new Topic(1L, "topic one", "topic one description");
       //String json = "{\"id\":1, \"name\":\"topic one\",\"description\":\"topic one description\"}";

        Mockito.when(service.addTopic(topic)).thenReturn(topic.getId());
                mockMvc.perform(MockMvcRequestBuilders.post("/topics")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
                Mockito.verify(service, times(1));
        //Mockito.verify(service).addTopic(new Topic(1L, "topic one", "topic one description"));
    }


//    @Test
//    public void updateTopic() {
//
//    }
//
    @Test
    public void deleteTopic() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/topics/{id}",1))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }



}




//MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);
//MockMvcResultMatchers.jsonPath("{\"id\":1, \"name\":\"topic one\",\"description\":\"topic one description\"}"