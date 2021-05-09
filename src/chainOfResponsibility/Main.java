package chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		Support alice = new NoSupport("alice");
		Support bob = new LimitSupport("bob", 100);
		Support diana = new LimitSupport("diana", 200);
		
		alice.setNext(bob).setNext(diana);
		
		for(int i = 0; i<500; i+=33) {
			alice.support(new Trouble(i));
		}
	}

}
