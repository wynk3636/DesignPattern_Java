package strategy;

public class Hand {
	
	public static final int GUU=0;
	public static final int CHO=1;
	public static final int PAA=2;
	
	public static final Hand[] hand = {
			new Hand(GUU),
			new Hand(CHO),
			new Hand(PAA),
	};
	
	private static final String[] name = {
			"goo","cho","paa"
	};
	
	private int handValue;
	
	private Hand(int handvalue) {
		this.handValue = handvalue;
	}
	
	public static Hand getHand(int handvalue) {
		return hand[handvalue];
	}
	
	public boolean isStrongerThan(Hand h) {
		return fight(h) ==1;
	}
	
	public boolean isWeakerThan(Hand h) {
		return fight(h) == -1;
	}
	
	private int fight(Hand h) {
		if(this==h) {
			return 0;
		}
		else if((this.handValue+1)%3==h.handValue){
			return 1;
		}
		else {
			return -1;
		}
	}
	
	public String toString() {
		return name[handValue];
	}

}
