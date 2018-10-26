package com.istone.codetest.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@WebMvcTest
public class AlertControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testPostAnDatbaseAlert() throws Exception {
        ResultActions resultActions = mockMvc
                .perform(MockMvcRequestBuilders.post("/alert")
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content("{\n" +
                                "    \"message\": \"This is a test alert to the database.\",\n" +
                                "    \"type\": \"info\",\n" +
                                "    \"channel\": \"database\"\n" +
                                "}"));

        resultActions.andExpect(MockMvcResultMatchers.content().string("{\"response\":\"sent\"}"));
    }

    @Test
    public void testPostAnSMSAlert() throws Exception {
        ResultActions resultActions = mockMvc
                .perform(MockMvcRequestBuilders.post("/alert")
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content("{\n" +
                                "    \"message\": \"This is a test alert to the database.\",\n" +
                                "    \"type\": \"info\",\n" +
                                "    \"channel\": \"sms\"\n" +
                                "}"));

        resultActions.andExpect(MockMvcResultMatchers.content().string("{\"response\":\"sent\"}"));
    }

    @Test
    public void testStatus() throws Exception {
        ResultActions resultActions = mockMvc
                .perform(MockMvcRequestBuilders.get("/status"));

        resultActions.andExpect(MockMvcResultMatchers.content().string("{\"response\":\"green,green,yellow\"}"));
    }

}
