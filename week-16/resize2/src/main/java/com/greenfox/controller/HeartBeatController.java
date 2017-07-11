package com.greenfox.controller;

import com.greenfox.model.HeartBeat;
import com.greenfox.model.HeartBeatStatus;
import com.greenfox.repository.HeartBeatRepository;
import com.greenfox.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartBeatController {

  @Autowired
  StatusService statusService;

  @GetMapping("/heartbeat")
  public HeartBeatStatus returnStatus() {
    return statusService.returnStatusBasedOnRepository();
  }
}
