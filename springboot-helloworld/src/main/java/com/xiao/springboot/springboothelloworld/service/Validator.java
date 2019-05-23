package com.xiao.springboot.springboothelloworld.service;

import static java.lang.System.*;

/**
 * @author xiaojianpeng
 * @date 2019-05-14
 */
public class Validator {
  private final ValidationStrategy strategy;

  public Validator(ValidationStrategy v){
    this.strategy = v;
  }
  public boolean validate(String s){
    return strategy.execute(s);
  }

  public static void main(String[] args) {
    Validator numericValidator = new Validator(new IsNumeric());
    boolean b1 = numericValidator.validate("aaaa");
    out.println(b1);
    Validator lowerCaseValidator = new Validator(new IsAllLowerCase ());
    boolean b2 = lowerCaseValidator.validate("bbbb");
    out.println(b2);
    Validator validator3 = new Validator((String s) -> s.contains("d"));
    boolean b3 = validator3.validate("asd");
    out.println(b3);
  }
}
