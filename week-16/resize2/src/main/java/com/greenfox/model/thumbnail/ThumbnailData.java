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
    this.type = "thumbnails";
    this.attributes = attributes;
  }

  public ThumbnailData() {
    this.type = "thumbnails";
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

  public void setId(long id) {
    Id = id;
  }

  public ThumbnailAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ThumbnailAttributes attributes) {
    this.attributes = attributes;
  }
}
