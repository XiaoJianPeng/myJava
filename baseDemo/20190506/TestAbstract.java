/*
* 抽象类:当多个具体的实体类存在着共同的行为，但是有不同的表现，
* 我们在父类继承过程中父类的方法和具体实现不确定，
* 但是能确定的是他们都有这些行为。我们把这种行为的方法称为抽象方法
* 
* 抽象类不能被实例化，只能被继承，然后实例化子类。
* 继承了抽象类的非抽象类，必须实现抽象类的所有抽象方法。
* 抽象类可以继承抽象类，不用实现父类的抽象方法。
*/
abstract class Person {
  String name;
  int age;
  public void sleep(){
    System.out.print(name+"在睡觉");
  }
  public abstract void smoke();
}

class Student extends Person{
  public void smoke(){
    System.out.println(name+"在厕所抽烟");
  }
}

class Worker extends Person{
  public void smoke(){
    System.out.println(name+"一边干活一边抽烟");
  }
}

public class TestAbstract{
  public static void main(String[] args){
    Student s = new Student();
    s.name="学生张三";
    s.smoke();
    
    Worker w = new Worker();
    w.name="工人张三";
    w.smoke();
  }
}