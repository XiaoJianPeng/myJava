class Singleton {
	private Singleton(){
	}
  /* 懒汉模式
  private static Singleton s;
	public static Singleton getInstance() {
		if(s == null){
			s = new Singleton();
		}
		return s;
	}
  */
  // 饿汉模式
  private static Singleton s = new Singleton();
  public static Singleton getInstance() {
		if(s == null){
			s = new Singleton();
		}
		return s;
	}
	
}

public class SingletonTest{
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1);
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2);
	}
}