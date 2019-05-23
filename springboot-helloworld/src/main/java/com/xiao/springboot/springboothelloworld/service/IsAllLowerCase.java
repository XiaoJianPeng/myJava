package com.xiao.springboot.springboothelloworld.service;

public class IsAllLowerCase implements ValidationStrategy {
  public boolean execute(String s) {
    return s.matches("[a-z]+");
  }
}
