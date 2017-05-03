package com.greenfoxacademy.controllers;

import com.greenfoxacademy.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Exercise1 {

  @RequestMapping("/exercise1")
  public String getFirstEndPoint(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", true);
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("animalType", bankAccount.getAnimalType());
    return "exercise1";
  }
}
