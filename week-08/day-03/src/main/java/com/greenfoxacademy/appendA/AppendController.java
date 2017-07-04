package com.greenfoxacademy.appendA;

import com.greenfoxacademy.doubling.ErrorMessage;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppendController {

  @RequestMapping(value = "/appenda/{appendable}", method = RequestMethod.GET)
  public Append getAppend(@PathVariable(value = "appendable", required = true) String toAppend) {
    Append append = new Append();
    append.setAppended(toAppend);
    return append;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage parameterException(MissingServletRequestParameterException e) {
    return new ErrorMessage("404");
  }
}
