package singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("インスタンス生成");
	}
	public static Singleton getInstance() {
		return singleton;
	}
}
