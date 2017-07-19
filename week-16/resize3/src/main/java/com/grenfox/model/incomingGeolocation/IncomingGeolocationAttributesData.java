package com.grenfox.model.incomingGeolocation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IncomingGeolocationAttributesData {
  String name;
  double lat;
  @JsonProperty("long")
  double longitude;

  public IncomingGeolocationAttributesData(String name, double lat, double longitude) {
    this.name = name;
    this.lat = lat;
    this.longitude = longitude;
  }

  public IncomingGeolocationAttributesData() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getLat() {
    return lat;
  }

  public void setLat(double lat) {
    this.lat = lat;
  }

  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }
}
