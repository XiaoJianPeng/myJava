package com.xiao.springboot.springboothelloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

@RestController
public class HelloWorldController {
  // 打成jar包是 这里运行有异常，Could nor resolve placeholder 'xiao.msg' in value "${xiao.msg}"
  @Value("${xiao.msg}")
  private String msg;
  @RequestMapping("/hello")
  public String index(@RequestParam(required = true) @NotBlank String name){
    System.out.println("name:"+name);
    return "hello world!" + name + this.msg;
  }
}
