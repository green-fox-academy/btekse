package com.grenfox.model.response;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class ResponseThumbnailAttributesData {
  boolean is_main;
  boolean uploaded;
  String created_at;
  String content_url;

  public ResponseThumbnailAttributesData(boolean is_main, boolean uploaded, String created_at, String content_url) {
    this.is_main = is_main;
    this.uploaded = uploaded;
    this.created_at = created_at;
    this.content_url = content_url;
  }

  public ResponseThumbnailAttributesData() {
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

