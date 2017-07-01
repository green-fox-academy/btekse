package com.greenfox.model;

import lombok.Setter;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "TypeOfMeals")
@Getter
@Setter

public class MealType {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String type;

  public MealType() {
    }

  public MealType(String type) {
    this.type = type;
  }
}
