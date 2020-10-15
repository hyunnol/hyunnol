package game;

public class lol extends Game{
	
	
	
	lol(int monthFee) {
		super(monthFee);
	}
	
	protected void getPriceOfMonth() {
		System.out.println("롤의 월 사용료는:"+ monthFee);
	}


}
