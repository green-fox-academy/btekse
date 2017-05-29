package com.greenfox.controller;

import com.greenfox.model.User;
import com.greenfox.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

  @Autowired
  UserRepository userRepository;

  String missingUserName = "";

  @RequestMapping(value = "/enter")
  public String enter(Model model) {
    if (userRepository.count() > 0) {
      return "redirect:/";
    } else {
      model.addAttribute("error", missingUserName);
      return "enter"; //1 if; ? :
    }
  }

  @RequestMapping(value = "/addUser")
  public String addUser(Model model, @RequestParam(name = "name", required = false) String name) {
    if (name.isEmpty()) {
      missingUserName = "The username field is empty";
      return "redirect:/enter";
    } else {
      userRepository.save(new User(name));
      missingUserName = "";
      return "redirect:/";
    }
  }


}
