/*
* ������:����������ʵ��������Ź�ͬ����Ϊ�������в�ͬ�ı��֣�
* �����ڸ���̳й����и���ķ����;���ʵ�ֲ�ȷ����
* ������ȷ���������Ƕ�����Щ��Ϊ�����ǰ�������Ϊ�ķ�����Ϊ���󷽷�
* 
* �����಻�ܱ�ʵ������ֻ�ܱ��̳У�Ȼ��ʵ�������ࡣ
* �̳��˳�����ķǳ����࣬����ʵ�ֳ���������г��󷽷���
* ��������Լ̳г����࣬����ʵ�ָ���ĳ��󷽷���
*/
abstract class Person {
  String name;
  int age;
  public void sleep(){
    System.out.print(name+"��˯��");
  }
  public abstract void smoke();
}

class Student extends Person{
  public void smoke(){
    System.out.println(name+"�ڲ�������");
  }
}

class Worker extends Person{
  public void smoke(){
    System.out.println(name+"һ�߸ɻ�һ�߳���");
  }
}

public class TestAbstract{
  public static void main(String[] args){
    Student s = new Student();
    s.name="ѧ������";
    s.smoke();
    
    Worker w = new Worker();
    w.name="��������";
    w.smoke();
  }
}