class Teacher {
  String name;
  int age;
  
  public void teach() {
    System.out.println(name+"在上课");
  }
}

class JavaTeacher extends Teacher{
  Boolean isGlass;
  
  // 重写，重写不代表父类方法消失了
  public void teach() {
    System.out.println(name+"在上JAVA课");
  }
  
  public void method(){
    super.teach();
  }
}

public class TestTeacher{
  public static void main(String[] args){
    JavaTeacher jt = new JavaTeacher();
    jt.name="王老师";
    jt.teach();
    jt.method();
    
  }
}