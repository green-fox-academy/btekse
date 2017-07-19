package com.grenfox.controller;

import com.grenfox.model.incomingGeolocation.IncomingGeolocationData;
import com.grenfox.model.response.ResponseThumbnail;
import com.grenfox.service.GeolocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeolocationController {

  @Autowired
  GeolocationService geolocationService;

  @GetMapping("/api/locations")
  public ResponseThumbnail geolocationResponse() {
    return geolocationService.createGeolocationResponse();
  }

  @PostMapping("/api/locations")
  public ResponseThumbnail geolocationIncomingData(@RequestBody IncomingGeolocationData incomingGeolocationData) {
    return geolocationService.createGeolocationResponseFromPost(incomingGeolocationData);
  }
}
