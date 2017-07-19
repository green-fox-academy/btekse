package com.grenfox.model.incomingGeolocation;

public class IncomingGeolocationData {
  IncomingGeolocationDataData data;

  public IncomingGeolocationData(IncomingGeolocationDataData data) {
    this.data = data;
  }

  public IncomingGeolocationData() {
  }

  public IncomingGeolocationDataData getData() {
    return data;
  }

  public void setData(IncomingGeolocationDataData data) {
    this.data = data;
  }
}
