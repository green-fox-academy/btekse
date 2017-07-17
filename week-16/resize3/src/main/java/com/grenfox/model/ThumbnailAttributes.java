package com.grenfox.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "thumbnails")
public class ThumbnailAttributes {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private long hotel;
  private String type;
  private boolean is_main;
  private boolean uploaded;
  private String createdAt;
  private String contentUrl;

  public ThumbnailAttributes() {
  }

  public ThumbnailAttributes(long hotel, boolean is_main) {
    this.hotel = hotel;
    this.is_main = is_main;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getHotel() {
    return hotel;
  }

  public void setHotel(long hotel) {
    this.hotel = hotel;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getContentUrl() {
    return contentUrl;
  }

  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }
}
