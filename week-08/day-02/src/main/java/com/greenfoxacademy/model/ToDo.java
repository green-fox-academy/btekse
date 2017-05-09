package com.greenfoxacademy.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity //be tudja tenni sql táblába
@Table(name = "ToDOs")
@Getter
@Setter
public class ToDo {

  @Id /*primary key a todonak*/
  @GeneratedValue(strategy = GenerationType.AUTO) //növeli az Id-t
  int id;
  String title;
  boolean isUrgent = false;
  boolean isDone = false;

  public ToDo () {
  }

  public ToDo(String string) { //????????
    this.title = title;
    isUrgent = false;
    isDone = false;

  }

}
