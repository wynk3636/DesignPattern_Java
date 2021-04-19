package strategy;

public class Main {

	public static void main(String[] args) {
		
		if(args.length!=2) {
			System.out.println("fin");
			System.exit(0);
		}
		
		int seed1 = Integer.parseInt(args[0]);
		int seed2 = Integer.parseInt(args[1]);
		
		Player player1 = new Player("SAM", new WinningStrategy(seed1));
		Player player2 = new Player("TOM", new ProbStrategy(seed2));
		
		for(int i=0;i<10000;i++) {
			Hand nextHand1=player1.nextHand();
			Hand nextHand2=player2.nextHand();
			
			if(nextHand1.isStrongerThan(nextHand2)) {
				player1.win();
				player2.lose();
			}
			else if(nextHand2.isStrongerThan(nextHand1)) {
				player1.lose();
				player2.win();
			}
			else {
				player1.even();
				player2.even();
			}
		}
	}

}
