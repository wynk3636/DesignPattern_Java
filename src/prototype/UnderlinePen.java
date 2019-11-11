package prototype;

public class UnderlinePen implements Product {
	
	private char ulchar;
	public UnderlinePen(char decochar) {
		this.ulchar = decochar;
	}

	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		System.out.println("¥" + s + "¥");
		System.out.println("");
		for(int i = 0; i< length + 4; i++) {
			System.out.println(ulchar);
		}
		System.out.println("");
	}

	@Override
	public Product createClone() {
		Product p = null;
		try {
			p = (Product)clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return p;
	}

}
