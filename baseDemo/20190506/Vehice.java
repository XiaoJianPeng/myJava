class Vehice {
  private int speed;
  private int size;
  
  public void move(){
    System.out.println("移动了");
  }
  
  public void setSpeed(int speed) {
    this.speed = speed;
    System.out.print("设置速度：");
    this.info();
  }
  // 加速
  public void speedUp(){
    this.speed ++;
    System.out.print("加速：");
    this.info();
  }
  // 重载加速，
  public void speedUp(int sp){
    this.speed +=sp;
    System.out.print("自定义加速：");
    this.info();
  }
  
  public void speedDown() {
    this.speed --;
    System.out.print("减速：");
    this.info();
  }
  // 重载减速
  public void speedDown(int sp) {
    this.speed -=sp;
    System.out.print("自定义减速");
    this.info();
  }
  
  public void info() {
    System.out.println("速度"+this.speed+",尺寸："+this.size);
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