import Yahtzee.*;
import java.util.*;

public class PlayYahtzee{
	public static void main(String[] args){
		
		boolean cont = true;
		Yahtzee game = new Yahtzee();
		char choice = 'a';
		Scanner inputDevice = new Scanner(System.in);
		
		
		
		while(cont){
			System.out.println("=================================== \n");
			System.out.println("Player 1 \n");
			System.out.println("What would you like to do? \n");
			System.out.println("r) Roll Dice \n");
			System.out.println("c) Attempt to cheat \n");
			System.out.println("q) Quit Game \n");
			System.out.println("=================================== \n");
			
			choice = inputDevice.next().charAt(0);
			inputDevice.nextLine();
			
			if (choice == 'r'){
				System.out.println(game.oneToss());
				
			}
			if (choice == 'c'){
				System.out.println(game.oneCheat());
				
			}
			if (choice == 'q'){
				cont = false;
			}
			
			System.out.println("=================================== \n");
			System.out.println("Player 2 \n");
			System.out.println("What would you like to do? \n");
			System.out.println("r) Roll Dice \n");
			System.out.println("c) Attempt to cheat \n");
			System.out.println("q) Quit Game \n");
			System.out.println("=================================== \n");
			
			choice = inputDevice.next().charAt(0);
			inputDevice.nextLine();
			
			if (choice == 'r'){
				System.out.println(game.toss());
				
			}
			if (choice == 'c'){
				System.out.println(game.cheat());
				
			}
			if (choice == 'q'){
				cont = false;
			}
		}
	}
}