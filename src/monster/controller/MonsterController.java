package monster.controller;

import java.util.Scanner;
import monster.model.*;

public class MonsterController
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;
	
	public MonsterController()
	{
		firstMonster= new MarshmallowMonster("Basking Suffer", 0.5, 3, true, 3, 4);
		keyboardInput = new Scanner(System.in);
	}
//* The Basking Suffer as named by the tribes that hunted it, has half an antennae, and 3 eyes.
//*It has a belly button in the shape of a heart, 3 tails instead of arms, and 4 noses.
	public void start()
	{
			System.out.println("Here is my monster: " + firstMonster);
			System.out.println("It has this many eyes: " + firstMonster.getEyeCount());
			if(firstMonster.getEyeCount() >= 3) {
				System.out.println("I wonder why they need so many eyes...?");
			}
			System.out.println("The statement that it has a bellybutton would be " + firstMonster.getBellyButton());
			System.out.println("It has this many antennae: " + firstMonster.getAntennaCount());
			System.out.println("It has this many tails: " + firstMonster.getTailCount());
			if(firstMonster.getTailCount() > 1) {
				System.out.println("Oh, it has multiple tails? That's interesting, what do they use them for?");
			} else if(firstMonster.getTailCount() == 1) {
				System.out.println("Oh, a tail. That's cool.");		}
				System.out.println("It has this many noses: " + firstMonster.getNoseCount());
			if(firstMonster.getNoseCount() > 1) {
				System.out.println("With that many noses, I bet it can smell us right now!");		
			}
	
		System.out.println("You look upset. Wanna change the name?");
		String answer = keyboardInput.nextLine();
		
		if (answer.equalsIgnoreCase("yes"))
		{
		System.out.println("My name isn't good enough for you...? Then what would be better?");
		String newName = keyboardInput.nextLine();
		firstMonster.setName(newName);
		} else {
			System.out.println("Good, this name is solid kiddo.");
		}
		System.out.println(firstMonster);
	}
}

//Winning!//