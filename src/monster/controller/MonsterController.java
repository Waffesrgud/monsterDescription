package monster.controller;

import monster.model.*;
public class MonsterController
{
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	{
		firstMonster= new MarshmallowMonster("Basking Suffer", 0.5, 3, true, 3, 4);
	}
	//* The Basking Suffer as named by the tribes that hunted it, has half an antennae, and 3 eyes.
	//*It has a bellybutton in the shape of a heart, 3 tails instead of arms, and 4 noses.
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
			System.out.println("Oh, a tail. That's cool.");
		}
			System.out.println("It has this many noses: " + firstMonster.getNoseCount());
		if(firstMonster.getNoseCount() > 1) {
			System.out.println("With that many noses, I bet it can smell us right now!");

		}
	}
	
}
//Winning!//