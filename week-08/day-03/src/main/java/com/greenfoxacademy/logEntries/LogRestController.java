package com.greenfoxacademy.logEntries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogRestController {
  @Autowired
  LogRepository logRepo;

  @RequestMapping("/log")
  public Object log() {
    return logRepo.findAll();
  }
}

