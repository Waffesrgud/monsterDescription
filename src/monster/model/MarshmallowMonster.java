package monster.model;

public class MarshmallowMonster
{
	private String name;
	private double antennaCount;
	private int eyeCount;
	private boolean hasBellyButton;
	private int tailCount;
	//Used tails instead of arms, since it was aquatic. :c
	private int noseCount;

	public MarshmallowMonster()
	{
		this.name = "NAMELESS";
		this.antennaCount = -10000;
		this.eyeCount = -10000;
		this.hasBellyButton = false;
		this.tailCount = -10000;
		this.noseCount = -10000;
	}
	
	public MarshmallowMonster(String name, double antennaCount, int eyeCount, boolean hasBellyButton, int tailCount, int noseCount)
	{
		this.name = "Basking Suffer";
		this.antennaCount = .5;
		this.eyeCount = 3;
		this.hasBellyButton = true;
		this.tailCount = 3;
		this.noseCount = 4;
	}
	public String toString()
	{
		String description = "Name is " + this.name;
		
		return description;
	}

	public double getAntennaCount()
	{
		return antennaCount;
	}
	public boolean getBellyButton()
	{
		return hasBellyButton;
	}
	public int getEyeCount()
	{
		return eyeCount;
	}
	public int getTailCount()
	{
		return tailCount;
	}
	public int getNoseCount()
	{
		return noseCount;
	}
}

//* The Basking Suffer as named by the tribes that hunted it, has half an antennae, and 3 eyes.
//*It has a bellybutton in the shape of a heart, 3 tails instead of arms, and 4 noses.