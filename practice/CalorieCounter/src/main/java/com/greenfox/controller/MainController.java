package com.greenfox.controller;

import com.greenfox.model.Meal;
import com.greenfox.repository.MealRepository;
import com.greenfox.repository.MealTypeRepository;
import com.sun.org.glassfish.external.statistics.Statistic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

  @Autowired
  MealRepository mealRepository;

  @Autowired
  MealTypeRepository mealTypeRepository;

  @RequestMapping("/")
  public String index(Model model) {
    List<Meal> mealList = (List<Meal>) mealRepository.findAll();
    model.addAttribute("meal", mealList);
    model.addAttribute("stat", new Statistic(mealList));
    return "index";
  }
}
