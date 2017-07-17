package com.grenfox.model;

public class ThumbnailAttributesDTO {
  private boolean is_main;
  private boolean uploaded;
  private String createdAt;
  private String contentUrl;

  public ThumbnailAttributesDTO() {
  }

  public ThumbnailAttributesDTO(boolean is_main, boolean uploaded, String createdAt, String contentUrl) {
    this.is_main = is_main;
    this.uploaded = uploaded;
    this.createdAt = createdAt;
    this.contentUrl = contentUrl;
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
