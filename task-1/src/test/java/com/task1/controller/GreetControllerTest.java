package com.task1.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.task1.Controller.GreetController;

@WebMvcTest(GreetController.class)
public class GreetControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGreetWithName() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/greetapi/v1/hello?name=Rohini"))
               .andExpect(MockMvcResultMatchers.status().isOk())
               .andExpect(MockMvcResultMatchers.content().string("Hello Rohini!!"));
    }

    @Test
    public void testGreetWithoutName() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/greetapi/v1/hello"))
               .andExpect(MockMvcResultMatchers.status().isOk())
               .andExpect(MockMvcResultMatchers.content().string("Hello World!!"));
    }
}

