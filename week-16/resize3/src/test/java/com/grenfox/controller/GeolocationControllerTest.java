package com.grenfox.controller;

import com.grenfox.model.GeolocationAttributes;
import com.grenfox.model.response.ResponseGeolocationDataMap;
import com.grenfox.model.response.ResponseThumbnail;
import com.grenfox.model.response.ResponseThumbnailDataMap;
import com.grenfox.model.response.ResponseThumbnailLinksMap;
import com.grenfox.repository.GeolocationAttributesRepository;
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

import java.nio.charset.Charset;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@EnableWebMvc
public class GeolocationControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
    MediaType.APPLICATION_JSON.getSubtype(),
    Charset.forName("utf8"));
  private MockMvc mockMvc;

  @Autowired
  GeolocationAttributesRepository geolocationAttributesRepository;

  @Autowired
  WebApplicationContext webApplicationContext;

  ResponseThumbnail responseThumbnail;
  ResponseThumbnailDataMap responseThumbnailDataMap;
  ResponseGeolocationDataMap responseGeolocationDataMap;
  ResponseThumbnailLinksMap responseThumbnailLinksMap;

  @Before
  public void setup() throws Exception {
    mockMvc = webAppContextSetup(webApplicationContext).build();

    responseThumbnail = new ResponseThumbnail();
    responseThumbnailDataMap = new ResponseThumbnailDataMap();
    responseThumbnailDataMap.setId(1L);
    responseThumbnailDataMap.setType("locations");

    responseGeolocationDataMap = new ResponseGeolocationDataMap();
    responseGeolocationDataMap.setName("Budapest, Ipoly utca");
    responseGeolocationDataMap.setLat(47.5145641);
    responseGeolocationDataMap.setLongitude(19.051597);
    responseThumbnailDataMap.setAttributes(responseGeolocationDataMap);
    responseThumbnail.setData(responseThumbnailDataMap);

    responseThumbnailLinksMap = new ResponseThumbnailLinksMap();
    responseThumbnailLinksMap.setSelf("https://your-hostname.com/api/locations");

    responseThumbnail.setLinks(responseThumbnailLinksMap);


  }

  @Test
  public void geolocationResponse() throws Exception {
    geolocationAttributesRepository.deleteAll();
    geolocationAttributesRepository.save()
  }

}