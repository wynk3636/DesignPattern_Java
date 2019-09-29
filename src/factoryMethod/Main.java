package factoryMethod;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("aaa");
		Product card2 = factory.create("bbb");
		Product card3 = factory.create("ccc");
		
		card1.use();
		card2.use();
		card3.use();
	}

}
