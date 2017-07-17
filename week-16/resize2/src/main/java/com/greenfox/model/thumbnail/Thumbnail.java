package com.greenfox.model.thumbnail;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Thumbnail {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonIgnore
  long Id;

  @OneToOne
  ThumbnailLinks links;

  @OneToOne
  ThumbnailData data;

  public Thumbnail(ThumbnailLinks links, ThumbnailData data) {
    this.links = links;
    this.data = data;
  }

  public Thumbnail() {
  }

  public long getId() {
    return Id;
  }

  public ThumbnailLinks getLinks() {
    return links;
  }

  public void setLinks(ThumbnailLinks links) {
    this.links = links;
  }

  public ThumbnailData getData() {
    return data;
  }

  public void setData(ThumbnailData data) {
    this.data = data;
  }
}
