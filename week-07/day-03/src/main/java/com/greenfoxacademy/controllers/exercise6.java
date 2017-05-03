package com.greenfoxacademy.controllers;

import com.greenfoxacademy.BankAccount;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class exercise6 {

  @RequestMapping("/exercise6")
  public String getFifthEndPoint(Model model) {
    List<BankAccount> bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount("Simba", 100, "lion"));
    bankAccountList.add(new BankAccount("Nala", 200, "lion"));
    bankAccountList.add(new BankAccount("Pumba", 300, "warthog"));
    bankAccountList.add(new BankAccount("Timon", 100, "meerkat"));
    bankAccountList.add(new BankAccount("Scar", 100, "lion"));

    model.addAttribute("bankAccountList", bankAccountList);
    return "exercise6";
  }
}
