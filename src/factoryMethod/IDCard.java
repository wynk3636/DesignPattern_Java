package factoryMethod;

public class IDCard extends Product {
	
	private String owner;
	IDCard(String owner){
		System.out.println(owner + "のカードを作成");
		this.owner = owner;
	}
	
	@Override
	public void use() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(owner + "のカードを使用");
	}
	public String getOwner() {
		return owner;
	}

}
