package com.greenfox.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HeartBeat {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long Id;
  boolean status;

  public HeartBeat() {
  }

  public HeartBeat(boolean status) {
    this.status = status;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public long getId() {
    return Id;
  }
}

