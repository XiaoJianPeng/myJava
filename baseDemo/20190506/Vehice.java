class Vehice {
  private int speed;
  private int size;
  
  public void move(){
    System.out.println("�ƶ���");
  }
  
  public void setSpeed(int speed) {
    this.speed = speed;
    System.out.print("�����ٶȣ�");
    this.info();
  }
  // ����
  public void speedUp(){
    this.speed ++;
    System.out.print("���٣�");
    this.info();
  }
  // ���ؼ��٣�
  public void speedUp(int sp){
    this.speed +=sp;
    System.out.print("�Զ�����٣�");
    this.info();
  }
  
  public void speedDown() {
    this.speed --;
    System.out.print("���٣�");
    this.info();
  }
  // ���ؼ���
  public void speedDown(int sp) {
    this.speed -=sp;
    System.out.print("�Զ������");
    this.info();
  }
  
  public void info() {
    System.out.println("�ٶ�"+this.speed+",�ߴ磺"+this.size);
  }
  
  public static void main(String[] args) {
    Vehice vehice = new Vehice();
    vehice.speed = 5;
    vehice.size = 4;
    vehice.info();
    vehice.setSpeed(10);
    vehice.speedUp();
    vehice.speedDown();
    vehice.move();
    vehice.speedUp(50);
    vehice.speedDown(20);
  }
}