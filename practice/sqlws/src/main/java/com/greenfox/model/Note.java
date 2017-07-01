package com.greenfox.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Setter
@Getter
public class Note {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String name;
  private String file;
  private RedirectAttributes redirectAttributes;

  public Note() {
    }

  public Note(String file, RedirectAttributes redirectAttributes) {
    this.file = file;
    this.redirectAttributes = redirectAttributes;
  }

  /*@Override
  public String toString() {
    return id + ": " + text;
  }*/
}
