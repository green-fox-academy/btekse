package com.greenfoxacademy.controller;

import com.greenfoxacademy.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

  @Autowired
  ToDoRepository toDoRepo;

  @RequestMapping({"/", "/list"})
  public String index(Model model) {
    return "index";
  }
}
