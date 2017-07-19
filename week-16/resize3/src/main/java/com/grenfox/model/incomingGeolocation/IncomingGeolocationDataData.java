package com.grenfox.model.incomingGeolocation;

public class IncomingGeolocationDataData {
  String type;
  IncomingGeolocationAttributesData attributes;

  public IncomingGeolocationDataData(String type, IncomingGeolocationAttributesData attributes) {
    this.type = type;
    this.attributes = attributes;
  }

  public IncomingGeolocationDataData() {
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IncomingGeolocationAttributesData getAttributes() {
    return attributes;
  }

  public void setAttributes(IncomingGeolocationAttributesData attributes) {
    this.attributes = attributes;
  }
}
