package com.greenfoxacademy.beanproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedColorConfig {
  @Bean
  public MyColor redColor() {
    return new RedColor();
  }
}
