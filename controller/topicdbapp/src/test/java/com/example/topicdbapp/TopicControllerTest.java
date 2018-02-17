package com.example.topicdbapp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class) //use mockito runner

    public class TopicControllerTest {

    private MockMvc mockMvc;  //field for mockmvc object

    @InjectMocks
    private TopicController controller;  //instance

        @Mock
        private TopicService service;  //mock service

        @Before //initialize the mockmvc object and pass it the controller and build it
        public void setup(){
            mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        }

        @Test
        public void getAllTopics() throws Exception{
            mockMvc.perform(MockMvcRequestBuilders.get("/topics"))
                    .andExpect(MockMvcResultMatchers.status().isOk());  //expect
            Mockito.verify(service).getAllTopics();
        }

        @Test
        public void getTopic()throws Exception{
            //Arrange mock behavior
            List<Topic> topicList = Arrays.asList(
                    new Topic(1L,"topic one", "topic one description"),
                    new Topic(2L,"topic two", "topic two description")
            );
            //Act -performing the the request
            Mockito.when(service.getTopic(1L)).thenReturn(topicList.get(0));
            mockMvc.perform(MockMvcRequestBuilders.get("/topics/{id}",1))
                    .andExpect(MockMvcResultMatchers.status().isOk());
                    Mockito.verify(service).getTopic(1L);  //verify that the method was called
        }

        @Test
        public void addTopic(){

        }


}
