# JAVA设计模式之单例模式

### 定义

单例模式的意思就是只有一个实例。单例模式确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例。这个类称为单例类。

### 步骤

1. 私有化构造器
2. 定义一个类方法用于获得单例的对象，返回值是这个类的类型
3. 在这个勒种提供一个SIngleton类型的类属性
4. 实现getInstance这个类方法。

### 懒汉模式

类加载时不初始化，在用到时创建对象

**优缺点**：在类加载时，不创建实例，因此类加载速度快，但运行时获取对象的速度慢

### 饿汉模式

 在类加载时就完成了初始化

优缺点：在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快

```java
class Singleton {
	private Singleton(){
	}
  // 懒汉模式
  private static Singleton s;
	public static Singleton getInstance() {
		if(s == null){
			s = new Singleton();
		}
		return s;
	}
  /* 饿汉模式
  private static Singleton s = new Singleton();
  public static Singleton getInstance() {
		if(s == null){
			s = new Singleton();
		}
		return s;
	}
	*/
}

public class SingletonTest{
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1);
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2);
	}
}
```

