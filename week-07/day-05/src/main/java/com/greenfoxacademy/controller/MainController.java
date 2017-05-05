package com.greenfoxacademy.controller;

import com.greenfoxacademy.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @Autowired
  Fox fox;

  @RequestMapping("/")
  public String index(Model model) {
    fox.setName("a");
    fox.setFood("b");
    fox.setDrink("c");
    return "index";
  }

}
