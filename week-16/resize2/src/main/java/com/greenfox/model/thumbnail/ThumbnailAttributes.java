package com.greenfox.model.thumbnail;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ThumbnailAttributes {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonIgnore
  long Id;
  boolean is_main;
  boolean uploaded;
  String created_at;
  String content_url;

  public ThumbnailAttributes() {
  }

  public long getId() {
    return Id;
  }

  public void setId(long id) {
    Id = id;
  }

  public boolean isIs_main() {
    return is_main;
  }

  public void setIs_main(boolean is_main) {
    this.is_main = is_main;
  }

  public boolean isUploaded() {
    return uploaded;
  }

  public void setUploaded(boolean uploaded) {
    this.uploaded = uploaded;
  }

  public String getCreated_at() {
    return created_at;
  }

  public void setCreated_at(String created_at) {
    this.created_at = created_at;
  }

  public String getContent_url() {
    return content_url;
  }

  public void setContent_url(String content_url) {
    this.content_url = content_url;
  }
}
