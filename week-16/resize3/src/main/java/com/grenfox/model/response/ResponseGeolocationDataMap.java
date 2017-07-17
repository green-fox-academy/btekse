package com.grenfox.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseGeolocationDataMap {
  String name;
  double lat;
  @JsonProperty("long")
  double longtitude;

  public ResponseGeolocationDataMap(String name, double lat, double longtitude) {
    this.name = name;
    this.lat = lat;
    this.longtitude = longtitude;
  }

  public ResponseGeolocationDataMap() {
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

  public double getLongtitude() {
    return longtitude;
  }

  public void setLongtitude(double longtitude) {
    this.longtitude = longtitude;
  }
}
