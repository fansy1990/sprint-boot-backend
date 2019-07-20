package com.github.fansy.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * author : fanzhe
 * email : fansy1990@foxmail.com
 * date : 2019/7/20 PM12:34.
 */

public class ForSwaggerTest {

private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = standaloneSetup(new ForSwagger()).build();
    }

    @Test
    public void testSayHelloWorld() throws Exception {
        this.mockMvc.perform(
                get("/v2/test")
                .accept(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
        .andExpect(content().json("{\n" +
                "  \"1\": \"1\",\n" +
                "  \"2\": \"two\"\n" +
                "}"));

    }
}
