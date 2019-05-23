package com.xiao.springboot.springboothelloworld.service;

public class IsNumeric implements ValidationStrategy {
  @Override
  public boolean execute(String s) {
    return s.matches("\\d+");
  }
}
