package game;

public class Game {
		protected int monthFee;
	
		protected Game(int fee) {
			this.monthFee = fee;
		}
		
		protected void getPriceOfMonth() {
		System.out.println(monthFee);
	}

}
