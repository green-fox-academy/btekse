package com.greenfox.model;

public class Client {
  String id;

  public Client() {
    id = System.getenv("CHAT_APP_UNIQUE_ID");
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
