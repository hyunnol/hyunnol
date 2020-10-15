package game;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Game> gameList = new ArrayList<Game>();
		
		gameList.add(new Battleground(30000));
		gameList.add(new lol(20000));
		gameList.add(new overwatch(10000));
		
		for(int i =0; i<gameList.size(); i++) {
			Game gm = gameList.get(i);
			if(gm instanceof Battleground) {
				Battleground atg = (Battleground)gm;
			}else if (gm instanceof lol) {
				lol im = (lol)gm;
			}else if (gm instanceof overwatch) {
				overwatch ovw = (overwatch)gm;
			}
			
		}

	}

}
