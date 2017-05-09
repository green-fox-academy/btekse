package com.greenfoxacademy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ToDo {
  int id;
  String title;
  boolean isUrgent;
  boolean isDone;

  public ToDo (int id, String title, boolean isUrgent, boolean isDone) {
    this.id = id;
    this.title = title;
    this.isUrgent = false;
    this.isDone = false;
  }
}
