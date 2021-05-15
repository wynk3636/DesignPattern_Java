package mement;

public class Main {
	
	public static void main(String[] args) {
		Gamer gamer = new Gamer(100);
		Memento memento = gamer.createMemento();
		
		for(int i=0;i<100;i++) {
			gamer.bet();
			
			if(gamer.getMoney()>memento.getMoney()) {
				memento=gamer.createMemento();
			}
			else if(gamer.getMoney()<memento.getMoney()/2) {
				gamer.restoreMemento(memento);
			}
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}

}
