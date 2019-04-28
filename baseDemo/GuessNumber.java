import java.io.*;

public class GuessNumber{
  public static void main(String[] args)throws IOException{
    int num = 0;
    A a = new A();
    coutNum(a.v);
  }
  private static void coutNum (int v)throws IOException{
    System.out.println("请输入一个数字，然后按回车。");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = "";
    System.out.println("Enter 'q' to quit.");
    int num = 0;
    String s = br.readLine();
    if(!s.equals("q")){
        str += s;
    } else {
      return;
    }

    System.out.println(str);
    num =Integer.valueOf(str).intValue(); 
    if(num > v){
      System.out.println("猜大了");
      coutNum(v);  
    } else if (num < v){
      System.out.println("猜小了");
      coutNum(v);
    } else {
      System.out.println("猜对了");
    }
  }
}

class A {
  int v = 100;
  public A (){
    v = Math.randon
  }
}