package com.greenfox.controller;

import com.greenfox.model.HeartBeat;
import com.greenfox.model.HeartBeatStatus;
import com.greenfox.repository.HeartBeatRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.test.context.web.WebAppConfiguration;

import java.nio.charset.Charset;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@EnableWebMvc
public class HearthbeatEndpointTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
    MediaType.APPLICATION_JSON.getSubtype(),
    Charset.forName("utf8"));
  private MockMvc mockMvc;


  @Autowired
  private HeartBeatRepository heartBeatRepository;

  @Autowired
  WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testRepositoryEmptyTable() throws Exception {
    //heartBeatRepository.deleteAll();
    mockMvc.perform(get("/heartbeat"))
      .andExpect(status().isOk()) //200 httpstatus (ok)
      .andExpect(content().contentType(contentType)) //JSON object-tel való teszteléshez
      .andExpect(jsonPath("$.status").value("ok"))
      .andExpect(jsonPath("$.database").value("error"));
  }

  @Test
  public void testRepositoryWithData() throws  Exception {
    heartBeatRepository.save(new HeartBeat());
    mockMvc.perform(get("/heartbeat"))
      .andExpect(status().isOk())
      .andExpect(content().contentType(contentType))
      .andExpect(jsonPath("$.status").value("ok"))
      .andExpect(jsonPath("$.database").value("ok"));
    heartBeatRepository.deleteAll();
  }
}
