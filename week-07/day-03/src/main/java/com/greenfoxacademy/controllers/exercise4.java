package com.greenfoxacademy.controllers;

import com.greenfoxacademy.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class exercise4 {

  @RequestMapping("/exercise4")
  public String getFourthEndPoint(Model model) {
    String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", text);
    return "exercise4";
  }
}
