package com.xiao.springboot.springbootgradle.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  @GetMapping("/hello")
  public String index(@RequestParam String name) {
    logger.info(name);
    return "hello world!" + name;
  }
}
