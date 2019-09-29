package factoryMethod;

import java.util.*;

public class IDCardFactory extends Factory {
	private List<String> owners = new ArrayList<String>();
	@Override
	protected Product createProduct(String owner) {
		// TODO 自動生成されたメソッド・スタブ
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		// TODO 自動生成されたメソッド・スタブ
		owners.add(((IDCard)product).getOwner());
	}
	
	public List<String> getOwners() {
		return owners;
	}
}
