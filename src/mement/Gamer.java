package mement;

import java.io.ObjectInputStream.GetField;
import java.lang.management.MemoryManagerMXBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {

	private int money;
	private List fruits = new ArrayList();
	private Random random = new Random();
	private static String[] fruitsName= {
			"apple","greap","banana","orange"
	};
	
	public Gamer(int money) {
		this.money=money;
	}
	public int getMoney() {
		return money;
	}
	
	public void bet() {
		int dice = random.nextInt(6)+1;
		
		if(dice==1) {
			money+=100;
		}
		else if(dice==2) {
			money/=2;
		}
		else if(dice==6) {
			fruits.add(getFruit());
		}
	}
	
	public Memento createMemento() {
		Memento m = new Memento(money);
		Iterator it = fruits.iterator();
		while(it.hasNext()) {
			String f = (String)it.next();
			if(f.startsWith("good")) {
				m.addFruit(f);
			}
		}
		return m;
	}
	
	public void restoreMemento(Memento memento) {
		this.money=memento.money;
		this.fruits=memento.getFruits();
	}
	
	public String toString() {
		return money + "/" + fruits;
	}
	
	private String getFruit() {
		
		String prefix="";
		
		if(random.nextBoolean()) {
			prefix="good";
		}
		
		return prefix + fruitsName[random.nextInt(fruitsName.length)];
	}
}
