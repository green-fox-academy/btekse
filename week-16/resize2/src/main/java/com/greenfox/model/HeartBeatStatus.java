package com.greenfox.model;

import org.springframework.stereotype.Component;

@Component
public class HeartBeatStatus {
  String status;
  String database;

  public HeartBeatStatus() {
    this.status = "ok";
  }

  public HeartBeatStatus(String database) {
    this.status = "ok";
    this.database = database;
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
