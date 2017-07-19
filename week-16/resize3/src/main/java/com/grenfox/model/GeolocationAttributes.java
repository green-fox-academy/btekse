package com.grenfox.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "geolocation")
public class GeolocationAttributes {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String self;
  private String type;
  private String name;
  private double lat;
  @JsonProperty("long")
  private double longitude;

  public GeolocationAttributes() {
  }

  public GeolocationAttributes(long id) {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
