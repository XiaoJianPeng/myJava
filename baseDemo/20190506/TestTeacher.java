class Teacher {
  String name;
  int age;
  
  public void teach() {
    System.out.println(name+"���Ͽ�");
  }
}

class JavaTeacher extends Teacher{
  Boolean isGlass;
  
  // ��д����д�������෽����ʧ��
  public void teach() {
    System.out.println(name+"����JAVA��");
  }
  
  public void method(){
    super.teach();
  }
}

public class TestTeacher{
  public static void main(String[] args){
    JavaTeacher jt = new JavaTeacher();
    jt.name="����ʦ";
    jt.teach();
    jt.method();
    
  }
}