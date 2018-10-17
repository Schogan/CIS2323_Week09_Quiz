package Dice;
import java.util.*;

public class Dice{
	
	private	Random random;
	private int number;	
	
	public Dice(){
		random = new Random();
	}
	public int Roll(){
		number = random.nextInt(6)+1;
		return number;	
	}
}