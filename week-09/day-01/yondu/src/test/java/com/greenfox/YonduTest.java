package com.greenfox;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;


import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = YonduApplicationTests.class)
@WebAppConfiguration
@EnableWebMvc
public class YonduTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void statusOkYondu() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.distance", is(100.0)))
      .andExpect(jsonPath("$.time", is(10.0)))
      .andExpect(jsonPath("$.speen", is(10.0)));
  }

  @Test
  public void statusNokYondu() throws Exception {
    mockMvc.perform(get("/yondu"))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.error").value("Yondu Error!"));
  }
}
