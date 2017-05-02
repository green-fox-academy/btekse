package controllers;

import org.springframework.web.bind.annotation.RestController;

public class Greeting {
  private long id;
  private String content;

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

}
