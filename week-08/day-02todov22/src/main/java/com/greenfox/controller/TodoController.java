package com.greenfox.controller;


import com.greenfox.model.ToDo;
import com.greenfox.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  @Autowired
  ToDoRepository toDoRepo;

  @RequestMapping({"/", "/list"})
  public String index(Model model) {
    return "index";
  }

  @RequestMapping("/todo")
  public String todo(Model model) {
    model.addAttribute("text", toDoRepo.findAll());
    return "todo";
  }

  @RequestMapping("/addTodo")
  public String addTodo(Model model, @RequestParam("title") String param) {
    toDoRepo.save(new ToDo(param));
    model.addAttribute("text", toDoRepo.findAll());
    return "redirect:/todo";
  }

}