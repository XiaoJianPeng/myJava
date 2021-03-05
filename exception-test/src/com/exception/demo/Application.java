package com.exception.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 编译器异常
 */
class Application {
  public static void main(String[] args) throws IOException {
//    ServerSocket ss = new ServerSocket(3306);
//    try{
//      ServerSocket ss = new ServerSocket(3306);
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//    writeFile();
    submitOrder(8);
  }


  public static void writeFile() throws FileNotFoundException {
    FileReader fw = new FileReader("d:\\aa.text");
  }

  public static void submitOrder(int num){
    if(num >3 ) {
      throw new com.exception.demo.CustomerException("数量不足"+num);
    }
  }
}