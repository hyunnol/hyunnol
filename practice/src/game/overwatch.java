package game;

public class overwatch extends Game{
	
	
	overwatch(int monthFee) {
		super(monthFee);
	}
	
	protected void getPriceOfMonth() {
		System.out.println("오버워치의 월 사용료는:"+ monthFee);
	}


}
