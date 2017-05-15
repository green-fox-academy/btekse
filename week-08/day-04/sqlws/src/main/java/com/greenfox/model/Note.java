package com.greenfox.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Setter
@Getter
public class Note {

  @Id //primary key
  @GeneratedValue(strategy = GenerationType.AUTO) //auto növeli
  private Long id;
  private String text;
  private Date date;

  public Note() {
    }

  public Note(String text) {
    this.text = text;
    this.date = new Date();
  }


  @Override
  public String toString() {
    return id + ": " + text;
  }
}
