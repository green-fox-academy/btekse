package com.greenfox.controller;

import com.greenfox.ErrorMessage;
import com.greenfox.model.Yondu;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class YonduController {

  @RequestMapping(value = "/yondu", method = RequestMethod.GET)
  public Yondu getYondu(@RequestParam(value = "distance") double distance, @RequestParam(value = "time") double time) {
    Yondu yondu = new Yondu(distance, time);
    return yondu;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage parameterException(MissingServletRequestParameterException e) {
    String parameter = e.getParameterName();
    return new ErrorMessage("Yondu Error!");
  }
}
