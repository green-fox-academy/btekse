package com.greenfoxacademy.beanproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BlueColorConfig {
  @Bean
  public MyColor blueColor() {
    return new BlueColor();
  }

}
