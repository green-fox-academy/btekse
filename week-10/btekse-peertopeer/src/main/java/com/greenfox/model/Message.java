package com.greenfox.model;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;

@Entity
@Table(name = "messages")
public class Message {

  @Id
  private long id;
  private String username;
  private String text;
  private Timestamp timestamp;

  public Message() {
  }

  public Message(String username) {
    Random r = new Random();
    id = 1000000 + (long) (r.nextDouble() * (9999999 - 1000000));
    this.username = username;
    this.timestamp = new Timestamp(System.currentTimeMillis());
  }

  public Message(String username, String text) {
    this(username); //method overloading, másik konstruktor -ami ezt tartalmazza(username input)- azt átveszi !!!String adatot!!!
    this.text = text;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Timestamp timestamp) {
    this.timestamp = timestamp;
  }
}
