package com.greenfoxacademy.appendA;

/**
 * Created by Balázs on 2017. 07. 05..
 */
public class Append {
  String appended;

  public Append() {
  }

  public void setAppended(String toAppend) {
    appended = toAppend + "a";
  }

  public String getAppended() {
    return appended;
  }
}
