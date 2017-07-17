package com.grenfox.model.response;

public class ResponseThumbnailDataMap<T> {
  String type;
  long id;
  T attributes;

  public ResponseThumbnailDataMap(String type, long id, T attributes) {
    this.type = type;
    this.id = id;
    this.attributes = attributes;
  }

  public ResponseThumbnailDataMap() {
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public T getAttributes() {
    return attributes;
  }

  public void setAttributes(T attributes) {
    this.attributes = attributes;
  }
}
