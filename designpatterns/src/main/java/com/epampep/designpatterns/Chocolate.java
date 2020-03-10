package com.epampep.designpatterns;

public abstract class Chocolate implements SweetTemplate, Comparable<Chocolate> {
	int sweetness = 0;
	int sourness = 0;
	public int compareTo(Chocolate c)
	{
		return this.sweetness - c.sweetness;
	}
	public Chocolate(int sweet, int sour)
	{
		setSweetness(sweet);
		setSourness(sour);
	}
	public void setSweetness(int s)
	{
		sweetness = s;
	}
	public void setSourness(int s)
	{
		sourness = s;
	}
	public int getSweetness()
	{
		return sweetness;
	}
	public int getSourness()
	{
		return sourness;
	}
}
