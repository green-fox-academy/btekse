package com.greenfox.model.thumbnail;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
public class ThumbnailAttributes {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonIgnore
  long Id;
  boolean is_main;
  boolean uploaded;
  Timestamp created_at;
  String content_url;

  public ThumbnailAttributes() {
  }

  public ThumbnailAttributes(boolean is_main) {
    this.is_main = is_main;
  }

  public long getId() {
    return Id;
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

  public Timestamp getCreated_at() {
    return created_at;
  }

  public void setCreated_at(Timestamp created_at) {
    this.created_at = created_at;
  }

  public String getContent_url() {
    return content_url;
  }

  public void setContent_url(String content_url) {
    this.content_url = content_url;
  }
}
