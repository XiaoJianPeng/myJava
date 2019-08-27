package com.xiao.springboot.springboothelloworld.controller;

import com.xiao.springboot.springboothelloworld.exception.BusinessException;
import com.xiao.springboot.springboothelloworld.service.NumberSumService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.NotBlank;

@RestController
public class HelloWorldController {
  @Resource
  private NumberSumService numberSumService;
  // 打成jar包是 这里运行有异常，Could nor resolve placeholder 'xiao.msg' in value "${xiao.msg}"
  @Value("${xiao.msg}")
  private String msg;
  @RequestMapping("/hello")
  public String index(@RequestParam(required = true) @NotBlank String name){
    System.out.println("name:"+name);
//    int a = 22/0;
    return "hello world!" + this.msg;
//    throw new BusinessException("100","账号密码错误");
  }

  /**
   * 求n个数的和，并行流模式
   * @param n
   * @return
   */
  @RequestMapping(value ="/sum")
  public void sumNumber1(@RequestParam(required = true) Long n) {
    System.out.println("并行流模式-rangeClosed Parallel sum done in:" +
      numberSumService.measureSumPerf(numberSumService::parallelSum, n) + " msecs");
    System.out.println("并行流模式 - 循环迭代 Iterative sum done in:" +
      numberSumService.measureSumPerf(numberSumService::iterateSum, n) + " msecs");
    System.out.println("循序流-rangeClosed rangedSum sum done in:" +
      numberSumService.measureSumPerf(numberSumService::rangedSum, n) + " msecs");
    System.out.println("普通模式-循环流getSum sum done in:" +
      numberSumService.measureSumPerf(numberSumService::getSum, n) + " msecs");
  }

  /**
   * 求n个数的和，普通模式
   * @param n
   * @return
   */
  @RequestMapping(value ="/sum2")
  public void sumNumber2(@RequestParam(required = true) Long n) {
    System.out.println("Iterative sum done in:" +
      numberSumService.measureSumPerf(numberSumService::getSum, n) + " msecs");
  }

}
