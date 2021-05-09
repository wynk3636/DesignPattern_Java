package chainOfResponsibility;

public class Trouble {
	
	private int number;
	
	public Trouble(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String toString() {
		Integer num = Integer.valueOf(number);
		return num.toString();
	}

}
