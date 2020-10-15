package object;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class Test {

	public static void main(String[] args) {
		Ticket ticket1 = new Ticket(1);
		Ticket ticket2 = new Ticket(1);
		
	System.out.println(ticket1.equals(ticket2));
	System.out.println(ticket1==ticket2);
	
		

	}

}
