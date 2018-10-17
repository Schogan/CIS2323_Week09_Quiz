package Yahtzee;
import Dice.*;

public class Yahtzee{
	
	private Dice diceA;
	private Dice diceB;
	
	public Player1[] rollOne = new Player1[10];
	
	public Player2[] rollTwo = new Player2[10];
	
	public Yahtzee(){
		diceA = new Dice();
		diceB = new Dice();
		
	}
		
	int countOne=0;
		
	public String oneToss(){
		int dice1 = diceA.Roll();
		int dice2 = diceB.Roll();
		
		
		if (dice1 == 6 && dice2 == 6){
			return " !!!YAHTZEE!!! ";
		}else{
			String one = String.valueOf(dice1);
			String two = String.valueOf(dice2);
			return one + " " + two;
		}
		rollOne[countOne] = new Yahtzee();
		countOne++;
	}
	public String oneCheat(){
		int dice1 = diceA.Roll();
		try{		
			if (dice1 == 6 || dice1 == 1){
				return " !!!YAHTZEE!!! ";
				rollOne[countOne] = 6,6;
				countOne++;
			}
		}
		catch(Exception youCheater){
			System.out.println("You got caught!!!");
		}
		return "You just lost your hands you dirty cheater!!!";
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
		try{		
			if (dice1 == 6 || dice1 == 1){
				return " !!!YAHTZEE!!! ";
			}
		}
		catch(Exception youCheater){
			System.out.println("You got caught!!!");
		}
		return "You just lost your hands you dirty cheater!!!";
	}
}