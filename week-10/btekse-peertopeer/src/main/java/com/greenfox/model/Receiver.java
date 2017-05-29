package com.greenfox.model;

public class Receiver {
  private Message message;
  private Client client;

  public Receiver() {
  }

  public Receiver(Message message, Client client) {
    this.message = message;
    this.client = client;
  }

  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }
}
