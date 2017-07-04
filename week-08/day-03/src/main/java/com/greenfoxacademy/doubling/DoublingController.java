package com.greenfoxacademy.doubling;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ErrorMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {


  @RequestMapping("/doubling")
  public Doubling doubling(@RequestParam(value = "input"/*, required = true*/) int input) {
  Doubling doubling = new Doubling(input);
    return doubling;
  }

  @ExceptionHandler(Exception.class)
  public ErrorMessage missingDataException(Exception e) {
    return new ErrorMessage("Please provide an input!");
  }

}
