package com.greenfox.model.thumbnail;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ThumbnailLinks {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonIgnore
  long Id;

  String self;

  public ThumbnailLinks() {
  }

  public ThumbnailLinks(String self) {
    this.self = self;
  }

  public long getId() {
    return Id;
  }

  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }
}
