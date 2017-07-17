package com.greenfox.model.thumbnail;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class ThumbnailData {

  String type;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long Id;
  @OneToOne
  ThumbnailAttributes attributes;

  public ThumbnailData(ThumbnailAttributes attributes) {
    this.attributes = attributes;
  }

  public ThumbnailData() {
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public long getId() {
    return Id;
  }

  public ThumbnailAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ThumbnailAttributes attributes) {
    this.attributes = attributes;
  }
}
