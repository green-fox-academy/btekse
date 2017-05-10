package com.greenfoxacademy.greeter;

import com.greenfoxacademy.doubling.ErrorMessage;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreeterController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage parameterException(MissingServletRequestParameterException e) {
    String parameter = e.getParameterName();
    return new ErrorMessage("Please provide a " + parameter + "!");
  }

  @RequestMapping(value = "/greeter", method = RequestMethod.GET)
  public Greeter getGreeting(@RequestParam(value = "name", required = true) String name, @RequestParam(value = "title", required = true) String title) {
    Greeter greeting = new Greeter(name, title);
    return greeting;
  }
}
