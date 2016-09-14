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
	}
	
}
