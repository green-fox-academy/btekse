package com.greenfox.model; //leszármaztatás vagyinterface!!! Staterr&OK

public class StatusError {

  private String status;
  private String message;

  public StatusError() {
    this.status = "error";
    this.message = "Missing field(s): message.timestamp, client.id";
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
