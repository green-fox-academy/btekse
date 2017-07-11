package com.greenfox.controller;

import com.greenfox.model.HeartBeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartBeatController {

  @Autowired
  HeartBeatStatus heartBeatStatus;

  @GetMapping("/heartbeat")
  public HeartBeatStatus returnStatus() {
    return heartBeatStatus;
  }
}
