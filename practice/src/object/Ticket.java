package object;

public class Ticket {
	int num;
	
	Ticket(int num) {
		this.num = num;
	}
	
	
	public boolean equals(Object obj) {
		if(obj instanceof Ticket ) {
			Ticket tic = (Ticket)obj;
			if(this.num == tic.num) 
				return true;
			else return false;
						
			}
			return false;
		
	}
	
}
