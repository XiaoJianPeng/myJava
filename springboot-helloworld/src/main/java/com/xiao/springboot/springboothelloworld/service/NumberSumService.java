package com.xiao.springboot.springboothelloworld.service;

import org.springframework.stereotype.Service;

import java.util.function.Function;
import java.util.stream.LongStream;

@Service
public class NumberSumService {
  /**
   * 并行流模式 - 循环迭代
   * @param n
   * @return
   */
  public Long iterateSum(Long n) {
    return LongStream.iterate(1L, i-> i + 1)
      .limit(n)
      .parallel()
      .reduce(0L,Long ::sum);
  }

  /**
   * 并行流模式-rangeClosed
   * rangeClosed直接产生原始数据类型，没有装箱拆箱的开销
   * LongStream.rangeClosed会产生数字范围，很容易拆分成独立的小块
   * @param n
   * @return
   */
  public Long parallelSum(Long n) {
    return LongStream.rangeClosed(1L,n)
      .parallel()
      .reduce(0L,Long ::sum);
  }

  /**
   * 循序流-rangeClosed
   * @param n
   * @return
   */
  public Long rangedSum(Long n) {
    return LongStream.rangeClosed(1L,n)
      .reduce(0L,Long ::sum);
  }

  /**
   * 普通模式-循环流
   * @param n
   * @return
   */
  public Long getSum(Long n){
    long sum =0L;
    for(long i=0;i<=n;i++){
      sum +=i;
    }
    return sum;
  }

  public long measureSumPerf(Function<Long, Long> adder, long n) {
    long fastest = Long.MAX_VALUE;
    for (int i = 0; i < 10; i++) {
      long start = System.nanoTime();
      long sum = adder.apply(n);
      long duration = (System.nanoTime() - start) / 1_000_000;
//      System.out.println("Result: " + sum);
      if (duration < fastest) fastest = duration;
    }
    return fastest;
  }
}
