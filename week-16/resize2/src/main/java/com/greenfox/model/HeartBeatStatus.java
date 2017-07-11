package com.greenfox.model;

import org.springframework.stereotype.Component;

@Component
public class HeartBeatStatus {
  String status;

  public HeartBeatStatus() {
    this.status = "ok";
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
