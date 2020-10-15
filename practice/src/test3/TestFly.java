package test3;

import java.util.List;

public class TestFly {
	
	public static void main (String[] args) {
		List<Flyable> list = new ArrayList();
		Flyable f1 = new Airplane();
		Flyable f2 = new Bird();
		
		list.add(f1);
		list.add(f2);
		testFly();
}	
	
	static void testFly(List<Flyable> list) {
		for(Flyable f:list) {
			f.fly();  
		}
	}
	
	}
