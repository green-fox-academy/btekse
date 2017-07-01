package com.greenfox.model;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Meals")
@Setter
@Getter
public class Meal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private LocalDate date;
  private String type;
  private String description;
  private int calories;

  public Meal() {
  }

  public Meal(String type, String description, int calories) {
    date = LocalDate.now();
    this.type = type;
    this.description = description;
    this.calories = calories;
  }
}
