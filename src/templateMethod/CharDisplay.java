package templateMethod;

public class CharDisplay extends AbstractDisplay {
	
	private char ch;
	public CharDisplay(char ch) {
		this.ch=ch;
	}
	
	@Override
	public void open() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("<<");
	}

	@Override
	public void print() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(ch);
	}

	@Override
	public void close() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(">>");
	}

}
