package com.greenfox.model;

import org.springframework.stereotype.Component;

@Component
public class HeartBeatStatus {
  String status;
  String database;

  public HeartBeatStatus() {
    this.status = "ok";
  }

  public HeartBeatStatus(String df) {
    this.status = "ok";
    this.database = df;
  }

  public String getDatabase() {
    return database;
  }

  public void setDatabase(String database) {
    this.database = database;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
