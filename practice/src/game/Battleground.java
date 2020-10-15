package game;

public class Battleground extends Game{
	 
	
	Battleground(int monthFee) {
		super(monthFee);
	}
	
	protected void getPriceOfMonth() {
		System.out.println("배틀그라운드의 월 사용료는:"+ monthFee);
	}

}
