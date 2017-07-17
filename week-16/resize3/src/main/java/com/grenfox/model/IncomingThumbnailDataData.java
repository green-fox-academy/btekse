package com.grenfox.model;

public class IncomingThumbnailDataData {
  String type;
  CheckIfMain attributes;

  public IncomingThumbnailDataData(String type, CheckIfMain attributes) {
    this.type = type;
    this.attributes = attributes;
  }

  public IncomingThumbnailDataData() {
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CheckIfMain getAttributes() {
    return attributes;
  }

  public void setAttributes(CheckIfMain attributes) {
    this.attributes = attributes;
  }
}
