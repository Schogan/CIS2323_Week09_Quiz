package Yahtzee;
import Dice.*;

public class Yahtzee{
	
	private Dice diceA;
	private Dice diceB;
	
	public Yahtzee(){
		diceA = new Dice();
		diceB = new Dice();
		
	}
		
	public String toss(){
		int dice1 = diceA.Roll();
		int dice2 = diceB.Roll();
		
		if (dice1 == 6 && dice2 == 6){
			return " !!!YAHTZEE!!! ";
		}else{
			String one = String.valueOf(dice1);
			String two = String.valueOf(dice2);
			return one + " " + two;
		}
	}
	public String cheat(){
		int dice1 = diceA.Roll();
				
		if (dice1 == 6 || dice1 == 1){
			return " !!!YAHTZEE!!! ";
		}else{
			return "You just lost your hands you dirty cheater!!!";
		}
	}
}