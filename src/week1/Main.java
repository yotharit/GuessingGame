package week1;
/**
 * Main Method for GuessingGame
 * @author tharitpongsaneh
 *
 */
public class Main {

	public static void main(String[]args){
		GuessingGame game = new GuessingGame (20);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
}
